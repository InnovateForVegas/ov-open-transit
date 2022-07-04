# Open Transit Overview

The goal of this project is to enable development of practical applications of public transit data tied to physical transit systems at city scale.

Open Data should be captured and stored in meaningfully-segregated tables, using geographical information systems (GIS) best practices wherever possible, or enabling equivalent best practice access and maniupulation.

## Project Policies

Unless otherwise and specifically indicated with replacement files in this repository, this project will adhere to the default Code for Vegas Foundation policies for Code of Conduct and Contributing, found at

* [Code of Conduct - Code for Vegas Foundation](https://github.com/CodeForVegas/.github/blob/main/CODE_OF_CONDUCT.md)
* [Contributing to this Project - Code for Vegas Foundation](https://github.com/CodeForVegas/.github/blob/main/CONTRIBUTING.md)

## General Focus Areas

This is a large project with multiple components. There are existing tools, protocols, and data formats already in use based on open standards and proprietary applications, the aim is to augment and, eventually, replace these proprietary applications with options developed locally.

### Transit Data Service

Essential requirements are to capture and publish stable and realtime data about all things transit, mostly public mass transit but generic enough to support variants (point-to-point travel, bike share, monorail, etc etc).

The open standard for serving transit data is the Google Transit Data Feed (GTDF) and the GTDF-RT for publishing real-time updating equipment locations (ie moving buses). The supported GTDF features and associated data are documented on the developer page at the [RTC website](https://www.rtcsnv.com/ways-to-travel/transit-services/for-developers/), also listed below in the *References* section.

At present the local implementation of GTDF-based services is entirely depedant on an external company to capture real time equipment data and form the GTDF-RT feed, and maintain the GTDF published data set. This limits the amount of data that can be tied directly to route, equipment, and operating systems for general use.

A proposal is made here, to augment the standard GTDF data already available via outsourced third parties, with rider data to capture not only rider feedback, but ideal routing statistics (where are people riding from and to, and when), failure statistics (including non-ideal routes forced upon riders, individual route or operator issues, equipment issues, etc).

Thus the Open Transit Data Service will provide the GTDF data already available (initially received from the third party vendor already constructing the stable and realtime components) and additional data attached to these feeds to enable additional client and rider services.

### Transit Server Open Data

In cases where a rider using Public Transit reports an issue, that issue may be reported via social media, via a voice phone call, or using at least one specially-developed mobile application called *Transit Watch* to capture the issue report. These reports, as well as other statistical and operational data, are published either in GTDF content, or sometimes not made available at all.

This component will aim to make Open Transit Data compatible with general Open Data data sets by publishing such things as issue reports, operator issue reports (eg a bus driver failing to provide a level of service, reported by driver ID), route statistics for tardiness per scheduled trip, and so on, so that any rider or others may see the state of the transit system at a point in time and make their transit decisions accordingly.

By making data available as Open Data datasets, developers and other data consumers may use Open Transit Data along with other Open Data in ways perhaps not envisioned here.

### Transit Server

Capture, store, and expose these data:

* Modes (bus, bicycle, etc)
* Routes
* Detours
* Schedules (current and historical)
* Equipment status/history (mechanical issue reports, etc)
* Operator history (rider reports, etc)
* Real time location
* Privacy-wrapped user feedback

Analyze and expose via APIs and published Open Data sets (privacy aware):

* Real time traffic/arrival
* Ongoing transparency for reported issues
  * Trends in schedule deviations
  * Equipment maintenance trends
  * Operator trends (kudos, complaints)
* Rider origin and destination needs against scheduled stops and routes

These are not exhaustive, as public adoption of the Open Transit platform progresses it would be reasonable to assume there will be community feedback.

### Transit Client(s)

Tools for consumers of trarnsit services should consider the following:

* Accuracy and reliability. Trusting information, that it is correct, is essential.
* Usability, including a user/rider experience that is useful in real time (eg when attempting to catch THIS bus)
* Accessibility, including 
  * appropriate WAI-ARIA and visual attributes compatible with a variety of eye sight limitations
  * audio components and screen-reader compatibility
* Language flexibility with i18n and l10n considerations

The current (as of 2022) software client approach taken in the Las Vegas transit area, is to deploy multiple applications, developed by multiple vendors, to accomplish groups of tasks:

* TransitApp for managing schedule and real time update information for the rider
* RTC Transit Watch to report issues
* RideRTC to purchase tickets and obtain official RTC SNV information and updates
* myRTCpara for paratransit services (special accessibility, point-to-point)
* Club Ride Rewards to offer compensatory rewards for carpooling, etc
  
There may be others, and there are website analogs to some of these focus areas.

Transit client software could consolidate most, if not all of the functionality found in these standalone applications into a single Progressive Web Application (PWA) for example, to enable access to all of these services and more by anyone using transit services, waiting to pick someone up at a transit stop, dropping someone off at a transit stop, visiting Las Vegas from abroad, or commuting daily.

Special applications may be appropriate in rare circumstances, but a unified approach to transit consumer experience, rider or otherwise (including operators).

## References

<https://www.openapis.org/>

<https://www.rtcsnv.com/ways-to-travel/transit-services/for-developers/>
