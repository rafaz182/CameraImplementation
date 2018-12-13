package com.rafaelpereiraramos.cameraimplementation;

import android.support.annotation.IntDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Rafael P. Ramos on 13/12/2018.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.SOURCE)
@IntDef({android.graphics.ImageFormat.JPEG})
public @interface ImageFormat {
}
