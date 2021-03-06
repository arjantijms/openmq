/*
 * Copyright (c) 2000, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * @(#)DestScope.java	1.4 06/29/07
 */

package com.sun.messaging.jmq.util;

/**
 * Scope of a destination.
 * <P>
 * <B>XXX</B> How should serialization be handled.
 */

public class DestScope {
    public static final int UNKNOWN = -1;
    public static final int LOCAL = 0;
    public static final int CLUSTER = 1;
    /**
     * <B>Not supported in 3.5 </B>
     */
    public static final int DISTRIBUTED = 2;

    public static int getStateFromString(String str) {
        if (str.equals("LOCAL")) {
            return LOCAL;
        }
        if (str.equals("CLUSTER")) {
            return CLUSTER;
        }
        if (str.equals("DISTRIBUTED")) {
            return DISTRIBUTED;
        }
        return UNKNOWN;
    }

    public static String getString(int state) {
        switch (state) {
        case LOCAL:
            return "LOCAL";

        case CLUSTER:
            return "CLUSTER";

        case DISTRIBUTED:
            return "DISTRIBUTED";

        }
        return "UNKNOWN";

    }
}
