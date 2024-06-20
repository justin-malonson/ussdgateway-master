/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2017, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.mobicents.ussdgateway.slee.cdr;




/**
 * @author baranowb
 * 
 */
public interface ChargeInterface {

    public static final String TRACER_NAME="Charger";
    public static final String CRD_TRACER_NAME="cdr";
    /**
     * Initializes CDR storage.
     * 
     * @param reset - if <b>true</b> it resets storage.
     */ 
    public void init(boolean reset);
    
    
    public void setState(USSDCDRState state);
    
    public USSDCDRState getState();
    
    public void createRecord(RecordStatus outcome);

}
