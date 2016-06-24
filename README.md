# UAPI
UAPI aims to unify the various Minecraft Modern server APIs, and allow plugin developers the opportunity to write once support all. This project is mostly for experimental purposes, but if it ends up getting some use, so be it.

#Supported APIs
Bukkit - For all purposes of this project we'll be referring to Spigot's modified version of the Bukkit API as "Bukkit"

Sponge - We'll have to find a way to allow plugin authors to not be limited by other APIs' limitations when it comes to Sponge

CanaryLib - Not sure about the status of CanaryLib, there's a new server that implements it, but doesn't seem to be modifying the it for future versions(?)

#Feature Implementation
The various UAPI features will be implemented in a set order based on a determined priority set by the UAPI developers. This order is in an attempt to make UAPI more usable sooner.

Current feature(s) being implemented: Entities, Events, and World   
Next feature(s) to start: Inventory, Commands, Configuration helpers(?)

Currently there isn't much of a list to map the equivalents of the three APIs we aim to support initially that is completely accurate. This creates an issue for those wishing to contribute to UAPI, but are not familiar with the various APIs enough to pinpoint what event is equivalent to what. To help resolve this issue, I've started a Google Doc Sheet to map out the class equivalents for the different APIs, which also includes UAPI. Currently, because this would require an immense amount of time to list every class on the mapping, I am mapping the classes as I go, and have started off with the events since they're the most important part, and possibly only useful part to UAPI contributors. If you wish to contribute feel free to contact me. https://docs.google.com/spreadsheets/d/185OgiB1Ixip9fMvkZsgXWl2VgLeCjt9MUFnl2NunQrA/edit#gid=0

#Contribute
Anyone is free to contribute to UAPI via Pull Request. Code style guidelines are found in the Standards.md class, and are currently a WIP, but for the most part use the current source as a guide.

#Special Thanks
* Mojang & Notch - For creating Minecraft in the first place
* Bukkit Team - For creating a robust API that continues to power majority of servers today.
* Sponge Team - For combining the best of both worlds, with a robust API and MinecraftForge support
* CanaryMod Team - For their effort on reviving the hMod community, which introduced me to programming in the first place
