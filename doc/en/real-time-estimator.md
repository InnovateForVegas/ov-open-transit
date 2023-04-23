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

# Open Transit Real Time Estimator

We assume that multiple transit vehicles are able to transmit real-time location information using a reliable means of communication to a central server which can capture and analyze all vehicle data at 1-second resolution, estimate next-stop arrival times, and publish the data using at least the Real Time General Transit Feed Specification (GTFS-RT) format, as is used today by various consumers (including Google, TransitApp, and others).

## Highest Priority Considerations

The real time data feed must always provide complete information for Consumer use in their Consumer Client. This means that a vehicle that is no longer transmitting its location data, for example, may not simply vanish from the real time feed, which leaves the Consumer without any information at all during what may be a real-time transit activity (rushing to work, rushing to school, etc). The real time feed must therefore be viewed as a status update in general, not merely a trip update for individual vehicles (which may or may not transmit consistent and reliable data from all points at all times).

With this in mind, the Real Time Estimator should always generate an estimated location based on all available data to a given point in time, to provide some estimated location in the event of real time transmission interruption from the vehicle, and such estimated location data should be marked as estimated until such time as real data is once again acquired.

## Specification Details

## External Reference Materials

- [RTC website](https://www.rtcsnv.com/ways-to-travel/transit-services/for-developers/)
- [Google References on Transit (GTFS)](https://developers.google.com/transit/site-map)
- [GTFS Standard Site](https://gtfs.org/)

## User Stories

Individual stories may be converted into Issues, or consolidated or exploded as needed for development and implementation.

**Terms**:

- **Consumer**: a bus rider, bike share user, and so on.
- **Operator**: a bus driver, and so on.
- **Controller**: a transit operations staff member, and so on.
- **Company**: a transit company, commission, or other agency overseeing transit services

### Typical Uses

- **Card**: As a Consumer, I need to know when my bus will arrive so that I can plan my arrival at the bus stop accordingly.
  - **Conversation**: Each consumer of transit services has their own journey to make from their actual point of origin to the bus stop at which they will wait for the arrival of their bus.
  - **Confirmation**:
    - Consumer is able to determine estimated versus scheduled arrival time for any route at any stop, with statistical information presented in clear terms (% on time, etc)

Converted to https://github.com/InnovateForVegas/ov-open-transit/issues/18

---
