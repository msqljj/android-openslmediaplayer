/*
 *    Copyright (C) 2014 Haruki Hasegawa
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */


package com.h6ah4i.android.media.openslmediaplayer.utils;

import com.h6ah4i.android.media.IBasicMediaPlayer;

public class PreparedListenerObject
        extends BasicMediaPlayerEventListenerObject
        implements IBasicMediaPlayer.OnPreparedListener {

    public PreparedListenerObject() {
        super();
    }

    public PreparedListenerObject(Object syncObj) {
        super(syncObj);
    }

    @Override
    public void onPrepared(IBasicMediaPlayer mp) {
        trigger();
    }
}