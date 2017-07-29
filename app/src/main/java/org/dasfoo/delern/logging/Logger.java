/*
 * Copyright (C) 2017 Katarina Sheremet
 * This file is part of Delern.
 *
 * Delern is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * Delern is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with  Delern.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.dasfoo.delern.logging;

import android.util.Log;

import com.crashlytics.android.Crashlytics;

import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

@SuppressWarnings({"serial", "PMD.TooManyMethods"})
class Logger extends MarkerIgnoringBase {

    private static final int MAX_TAG_LENGTH = 23;

    private final String mTag;

    Logger(final String name) {
        super();
        mTag = name
                .substring(name.lastIndexOf('.') + 1)
                .substring(0, MAX_TAG_LENGTH - 1);
    }

    @Override
    public String getName() {
        return mTag;
    }

    @Override
    public boolean isTraceEnabled() {
        return Log.isLoggable(mTag, Log.VERBOSE);
    }

    @Override
    public void trace(final String msg) {
        Crashlytics.log(Log.VERBOSE, mTag, msg);
    }

    @Override
    public void trace(final String format, final Object arg) {
        final FormattingTuple ft = MessageFormatter.format(format, arg);
        Crashlytics.log(Log.VERBOSE, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void trace(final String format, final Object arg1, final Object arg2) {
        final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
        Crashlytics.log(Log.VERBOSE, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void trace(final String format, final Object... arguments) {
        final FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
        Crashlytics.log(Log.VERBOSE, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void trace(final String msg, final Throwable t) {
        Crashlytics.log(Log.VERBOSE, mTag, msg);
        if (t != null) {
            Crashlytics.logException(t);
        }
    }

    @Override
    public boolean isDebugEnabled() {
        return Log.isLoggable(mTag, Log.DEBUG);
    }

    @Override
    public void debug(final String msg) {
        Crashlytics.log(Log.DEBUG, mTag, msg);
    }

    @Override
    public void debug(final String format, final Object arg) {
        final FormattingTuple ft = MessageFormatter.format(format, arg);
        Crashlytics.log(Log.DEBUG, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void debug(final String format, final Object arg1, final Object arg2) {
        final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
        Crashlytics.log(Log.DEBUG, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void debug(final String format, final Object... arguments) {
        final FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
        Crashlytics.log(Log.DEBUG, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void debug(final String msg, final Throwable t) {
        Crashlytics.log(Log.DEBUG, mTag, msg);
        if (t != null) {
            Crashlytics.logException(t);
        }
    }

    @Override
    public boolean isInfoEnabled() {
        return Log.isLoggable(mTag, Log.INFO);
    }

    @Override
    public void info(final String msg) {
        Crashlytics.log(Log.INFO, mTag, msg);
    }

    @Override
    public void info(final String format, final Object arg) {
        final FormattingTuple ft = MessageFormatter.format(format, arg);
        Crashlytics.log(Log.INFO, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void info(final String format, final Object arg1, final Object arg2) {
        final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
        Crashlytics.log(Log.INFO, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void info(final String format, final Object... arguments) {
        final FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
        Crashlytics.log(Log.INFO, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void info(final String msg, final Throwable t) {
        Crashlytics.log(Log.INFO, mTag, msg);
        if (t != null) {
            Crashlytics.logException(t);
        }
    }

    @Override
    public boolean isWarnEnabled() {
        return Log.isLoggable(mTag, Log.WARN);
    }

    @Override
    public void warn(final String msg) {
        Crashlytics.log(Log.WARN, mTag, msg);
    }

    @Override
    public void warn(final String format, final Object arg) {
        final FormattingTuple ft = MessageFormatter.format(format, arg);
        Crashlytics.log(Log.WARN, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void warn(final String format, final Object arg1, final Object arg2) {
        final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
        Crashlytics.log(Log.WARN, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void warn(final String format, final Object... arguments) {
        final FormattingTuple ft = MessageFormatter.format(format, arguments);
        Crashlytics.log(Log.WARN, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void warn(final String msg, final Throwable t) {
        Crashlytics.log(Log.WARN, mTag, msg);
        if (t != null) {
            Crashlytics.logException(t);
        }
    }

    @Override
    public boolean isErrorEnabled() {
        return Log.isLoggable(mTag, Log.ERROR);
    }

    @Override
    public void error(final String msg) {
        Crashlytics.log(Log.ERROR, mTag, msg);
    }

    @Override
    public void error(final String format, final Object arg) {
        final FormattingTuple ft = MessageFormatter.format(format, arg);
        Crashlytics.log(Log.ERROR, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void error(final String format, final Object arg1, final Object arg2) {
        final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
        Crashlytics.log(Log.ERROR, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void error(final String format, final Object... arguments) {
        final FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
        Crashlytics.log(Log.ERROR, mTag, ft.getMessage());
        if (ft.getThrowable() != null) {
            Crashlytics.logException(ft.getThrowable());
        }
    }

    @Override
    public void error(final String msg, final Throwable t) {
        Crashlytics.log(Log.ERROR, mTag, msg);
        if (t != null) {
            Crashlytics.logException(t);
        }
    }
}
