package com.sabloane.services;

import com.sabloane.services.BMPImageLoader;
import com.sabloane.services.ImageLoader;

public class ImageLoaderFactory {
    public static ImageLoader create(String imageName) throws Exception {
        if (imageName.endsWith(".jpg"))
            return new JPGImageLoader(imageName);
        else if (imageName.endsWith(".bmp"))
            return new BMPImageLoader(imageName);
        else
            throw new Exception("Unsupported image type");
    }
}
