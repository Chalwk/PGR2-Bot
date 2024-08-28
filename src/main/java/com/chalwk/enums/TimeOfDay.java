/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */

package com.chalwk.enums;

public enum TimeOfDay {
    DAY("Day :sunrise:"),
    NIGHT("Night :night_with_stars:");

    private final String displayText;

    TimeOfDay(String displayText) {
        this.displayText = displayText;
    }

    public String getDisplayText() {
        return displayText;
    }
}