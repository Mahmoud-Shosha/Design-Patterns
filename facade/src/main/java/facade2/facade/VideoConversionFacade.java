package facade2.facade;

import java.io.File;

import facade2.complexmedialibrary.AudioMixer;
import facade2.complexmedialibrary.BitrateReader;
import facade2.complexmedialibrary.Codec;
import facade2.complexmedialibrary.CodecFactory;
import facade2.complexmedialibrary.MPEG4CompressionCodec;
import facade2.complexmedialibrary.OggCompressionCodec;
import facade2.complexmedialibrary.VideoFile;

public class VideoConversionFacade {

	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);
		Codec destinationCodec;
		if (format.equals("mp4")) {
			destinationCodec = new MPEG4CompressionCodec();
		} else {
			destinationCodec = new OggCompressionCodec();
		}
		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}

}
