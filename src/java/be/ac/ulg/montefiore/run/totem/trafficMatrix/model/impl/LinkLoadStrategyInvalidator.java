/* TOTEM-v3.2 June 18 2008*/

/*
 * ===========================================================
 * TOTEM : A TOolbox for Traffic Engineering Methods
 * ===========================================================
 *
 * (C) Copyright 2004-2006, by Research Unit in Networking RUN, University of Liege. All Rights Reserved.
 *
 * Project Info:  http://totem.run.montefiore.ulg.ac.be
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU General Public License version 2.0 as published by the Free Software Foundation;
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
*/
package be.ac.ulg.montefiore.run.totem.trafficMatrix.model.impl;

import be.ac.ulg.montefiore.run.totem.domain.model.Link;
import be.ac.ulg.montefiore.run.totem.repository.CSPF.CSPFInvCap;
import be.ac.ulg.montefiore.run.totem.repository.CSPF.CSPF;
import be.ac.ulg.montefiore.run.totem.repository.CSPF.CSPFTEMetric;
import be.ac.ulg.montefiore.run.totem.repository.CSPF.CSPFInvFreeBw;
import be.ac.ulg.montefiore.run.totem.trafficMatrix.model.LinkLoadStrategy;

/*
* Changes:
* --------
*
*/

/**
 * Invalidates a LinkLoadComputer strategy when a topology change occurs, when a traffic matrix element change or when
 * a change occurs in a link for which spf metric is involved.
 *
 * <p>Creation date: 22/02/2008
 *
 * @author Gaël Monfort (monfort@run.montefiore.ulg.ac.be)
*/

public class LinkLoadStrategyInvalidator extends LinkLoadComputerInvalidator {
    public LinkLoadStrategyInvalidator(LinkLoadStrategy llc) {
        super(llc);
    }

    public void linkBandwidthChangeEvent(Link link) {
        LinkLoadStrategy lls = (LinkLoadStrategy)llc;
        if (lls.getSPFAlgo().getClass().getName().equals(CSPFInvCap.class.getName())) {
            lls.invalidate();
        }
    }

    public void linkMetricChangeEvent(Link link) {
        LinkLoadStrategy lls = (LinkLoadStrategy)llc;
        if (lls.getSPFAlgo().getClass().getName().equals(CSPF.class.getName())) {
            lls.invalidate();
        }
    }

    public void linkTeMetricChangeEvent(Link link) {
        LinkLoadStrategy lls = (LinkLoadStrategy)llc;
        if (lls.getSPFAlgo().getClass().getName().equals(CSPFTEMetric.class.getName())) {
            lls.invalidate();
        }
    }

    public void linkReservedBandwidthChangeEvent(Link link) {
        LinkLoadStrategy lls = (LinkLoadStrategy)llc;
        if (lls.getSPFAlgo().getClass().getName().equals(CSPFInvFreeBw.class.getName())) {
            lls.invalidate();
        }
    }

}
