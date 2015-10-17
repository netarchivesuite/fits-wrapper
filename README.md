Attempts at running FITS through a custom java classloader.
Also provides simple JAXB (un)marshalling of the XML output.

However...

FITS 0.8.x has a classloader unfriendly way of loading its xslt transformer.

FITS 0.9.0 has a very strange new classloader to load each tool which is very classloader unfriendly!

JHove1.12 uses ClassLoader.getSystem<...> methods which are classloader unfriendly.

New Zealand Metadata Extractor 3.6GC also use classloader unfriendly ClassLoader.getSystem<...> methods.

Patching all of these projects is just a pain. And to make thing more annoying FITS and NZME still use ant and include a fuckload of jars in their source distribution.

I did have some minor success patching JHove1.12 and FITS 0.8.10 to working with a custom classloader. <jolf@kb.dk> upgraded FITS to the latest JHove and also fixed some other outdates stuff.

The modified version of FITS can be found here: https://github.com/nclarkekb/fits