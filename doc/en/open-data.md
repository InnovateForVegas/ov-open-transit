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

# Open Transit Open Data

In keeping with overall open data goals, all Open Transit data, to the extent that it is possible without violating Consumer privacy, company policies, or laws, should be designed for publication as Open Data datasets.

## Highest Priority Considerations

Consumer privacy is paramount. While there are some scenarios where Consumer data is going to be identifiable (eg payment information, email address, phone number for SMS, etc), it is critical to design all data retention and access schemes to avoid correlation of Consumer identity and location, as well as identity and schedule, by default. While it is useful to know that A Consumer has a particular schedule and travels regularly from some origin to some destination, with distance to stops and other services included, it is not essential to know the actual identity of that Consumer.

## Specification Details

The schema to be used to actually store the Open Data datasets if defined in a separate document and may be a formal SQL definition, a more generalized DDL definition, or a UML diagram, or a combination of these as normative ideation. Back-annotation during actual development is encouraged to keep these documents current, but it is not intended to blog project progress to do so.

By making data available as Open Data datasets, developers and other data consumers may use Open Transit Data along with other Open Data in ways perhaps not envisioned here.

This component will aim to make Open Transit Data compatible with general Open Data data sets by publishing such things as issue reports, operator issue reports (eg a bus driver failing to provide a level of service, reported by driver ID), route statistics for tardiness per scheduled trip, and so on, so that any rider or others may see the state of the transit system at a point in time and make their transit decisions accordingly.

Capture, store, and expose these data:

- Modes (bus, bicycle, etc)
- Routes
- Detours
- Schedules (current and historical)
- Equipment status/history (mechanical issue reports, etc)
- Operator history (rider reports, etc)
- Real time location
- Privacy-wrapped Consumer feedback

**Note**: In cases where a Consumer reports an issue, that issue may be reported via social media, via a voice phone call, or using at least one specially-developed mobile application for RTC SNV called *Transit Watch* to capture the issue report. These reports, as well as other statistical and operational data, are published either in GTDF content, or sometimes not made available at all. Transparency is lost in these scenarios.

Analyze and expose via APIs and published Open Data sets (privacy aware):

- Real time traffic/arrival
- Ongoing transparency for reported issues
  - Trends in schedule deviations
  - Equipment maintenance trends
  - Operator trends (kudos, complaints)
- Consumer origin and destination needs against scheduled stops and routes

These are not exhaustive, as public adoption of the Open Transit platform progresses it would be reasonable to assume there will be community feedback.

## External Reference Materials

Links

## User Stories

Individual stories may be converted into Issues, or consolidated or exploded as needed for development and implementation.

**Terms**:

- **Consumer**: a bus rider, bike share user, and so on.
- **Operator**: a bus driver, and so on.
- **Controller**: a transit operations staff member, and so on.
- **Company**: a transit company, commission, or other agency overseeing transit services
- **Developer**: anyone using Open Transit data or interfaces to build new products or services

### Typical Uses

- **Card**: As a Developer, I would like to access Open Transit data with a RESTful API and integrate schedule, route, and real-time transit data into an application platform.
  - **Conversation**: Modern application and service development depends frequently on the use of eternal API endpoints which are implemented with RESTful access and interchange of data.
  - **Confirmation**:
    - Developer is able to access all public Open Transit data using RESTful APIs

---
