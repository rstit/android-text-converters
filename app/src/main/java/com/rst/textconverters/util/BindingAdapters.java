package com.rst.textconverters.util;

import android.databinding.BindingAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.rst.textconverters.util.converter.Converter;

/**
 * @author Bartosz Madry
 * @since 07.04.17
 */

public class BindingAdapters {
    @BindingAdapter({"converter", "text"})
    public static <U, V extends CharSequence> void applyConversion(@NonNull TextView view,
                                                                   @NonNull Converter<U, V> converter,
                                                                   @Nullable U value) {
        view.setText(converter.convert(value));
    }
}
