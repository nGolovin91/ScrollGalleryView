package com.veinhorn.scrollgalleryview.builder;

import androidx.fragment.app.FragmentManager;

public interface GallerySettingsBuilder {
    GallerySettingsBuilder thumbnailSize(int thumbnailSize);
    GallerySettingsBuilder enableZoom(boolean isZoomEnabled);
    GallerySettingsBuilder withFragmentManager(FragmentManager fragmentManager);
    GallerySettingsBuilder thumbnailMargins(int start, int top, int end, int bottom);
    GallerySettings build();
}
