<!--
 Copyright (C) 2022 Code for Vegas Foundation
 
 This file is part of ov-open-transit.
 
 ov-open-transit is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.
 
 ov-open-transit is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 
 You should have received a copy of the GNU General Public License
 along with ov-open-transit.  If not, see <http://www.gnu.org/licenses/>.
-->

# Open Transit Overview

The goal of this project is to enable development of practical applications of public transit data tied to physical transit systems at city scale.

Open Data should be captured and stored in meaningfully-segregated tables, using geographical information systems (GIS) best practices wherever possible, or enabling equivalent best practice access and maniupulation.

## Project Policies

Unless otherwise and specifically indicated with replacement files in this repository, this project will adhere to the default Code for Vegas Foundation policies for Code of Conduct and Contributing, found at

* [Code of Conduct - Code for Vegas Foundation](https://github.com/CodeForVegas/.github/blob/main/CODE_OF_CONDUCT.md)
* [Contributing to this Project - Code for Vegas Foundation](https://github.com/CodeForVegas/.github/blob/main/CONTRIBUTING.md)

## General Focus Areas

This is a large project with multiple components. There are existing tools, protocols, and data formats already in use based on open standards and proprietary applications, the aim is to augment and, eventually, replace these proprietary applications with options developed locally.

## Specification Documents

The specification(s) for the various components and goals of this project are located in the [Doc](doc/README.md) directory. Note that there should be localized versions of the specification documents as needed in this subdirectory.

### Transit Data Service

Essential requirements are to capture and publish stable and realtime data about all things transit, mostly public mass transit but generic enough to support variants (point-to-point travel, bike share, monorail, etc etc).

The open standard for serving transit data is the Google Transit Data Feed (GTDF) and the GTDF-RT for publishing real-time updating equipment locations (ie moving buses). The supported GTDF features and associated data are documented on the developer page at the [RTC website](https://www.rtcsnv.com/ways-to-travel/transit-services/for-developers/), also listed below in the *References* section.

At present the local implementation of GTDF-based services is entirely depedant on an external company to capture real time equipment data and form the GTDF-RT feed, and maintain the GTDF published data set. This limits the amount of data that can be tied directly to route, equipment, and operating systems for general use.

A proposal is made here, to augment the standard GTDF data already available via outsourced third parties, with rider data to capture not only rider feedback, but ideal routing statistics (where are people riding from and to, and when), failure statistics (including non-ideal routes forced upon riders, individual route or operator issues, equipment issues, etc).

Thus the Open Transit Data Service will provide the GTDF data already available (initially received from the third party vendor already constructing the stable and realtime components) and additional data attached to these feeds to enable additional client and rider services.

## References

<https://www.openapis.org/>

<https://www.rtcsnv.com/ways-to-travel/transit-services/for-developers/>
