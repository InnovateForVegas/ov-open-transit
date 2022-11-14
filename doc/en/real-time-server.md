<!--
 Copyright (C) 2022 Innovate for Vegas Foundation
 
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

# Open Transit Real Time Server

We assume that a **Public Transit Controller** (an Operations Staff Member) is overseeing day-to-day functionality of individual vehicles, aggregate grid performance over particular time intervals, real-time route changes due to detour, traffic delays, rider services, rider issues, and so on. The Real Time Server captures transmitted data from vehicles, other traffic data if possible, and input from Operators and Riders to correlate Real Time Situational Awareness.

## Highest Priority Considerations

It is critical to maintain time series data consistency, such that any source data drop-out or general loss must be inserted into the time series as missing data, not dropped entirely. The absence of data is itself data.

## Specification Details

Essential requirements are to capture and publish stable and real time data about all things transit, mostly public mass transit but generic enough to support variants (point-to-point travel, bike share, monorail, etc etc).

The open standard for serving transit data is the Google Transit Data Feed (GTDF) and the GTDF-RT for publishing real-time updating equipment locations (ie moving buses). The supported GTDF features and associated data are documented on the developer page at the [RTC website](https://www.rtcsnv.com/ways-to-travel/transit-services/for-developers/).

At present the local implementation of GTDF-based services is entirely dependent on an external company to capture real time equipment data and form the GTDF-RT feed, and maintain the GTDF published data set. This limits the amount of data that can be tied directly to route, equipment, and operating systems for general use.

A proposal is made here, to augment the standard GTDF data already available via outsourced third parties, with rider data to capture not only rider feedback, but ideal routing statistics (where are people riding from and to, and when), failure statistics (including non-ideal routes forced upon riders, individual route or operator issues, equipment issues, etc).

Thus the Open Transit Data Service will provide the GTDF data already available (initially received from the third party vendor already constructing the stable and real time components) and additional data attached to these feeds to enable additional client and rider services.

## External Reference Materials

Links

## User Stories

Individual stories may be converted into Issues, or consolidated or exploded as needed for development and implementation.

**Terms**:

- **Consumer**: a bus rider, bike share user, and so on.
- **Operator**: a bus driver, and so on.
- **Controller**: a transit operations staff member, and so on.
- **Company**: a transit company, commission, or other agency overseeing transit services

### Typical Uses

- **Card**: As a Consumer, I need to know when my bus will arrive so that I can plan my arrival at the bus stop accordingly.
  - **Conversation**: Each Consumer of transit services has their own journey to make from their actual point of origin to the bus stop at which they will wait for the arrival of their bus.
  - **Confirmation**:
    - Consumer is able to determine estimated versus scheduled arrival time for any route at any stop, with statistical information presented in clear terms (% on time, etc)

---
