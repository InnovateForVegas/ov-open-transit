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

# Open Transit Consumer Server

We assume that a *Public Transit Consumer* will benefit from storing route preferences, use passes, funding source information (eg payment card), use statistics, and other information in a server such that they may access this information from multiple devices and in the event a device is lost or stolen, in a privacy aware manner.

In some cases, some consumer data may be useful to Operations Staff (Controllers), in which case the data in question would be anonymized to the extent that is possible and appropriate, and Consumer would be  aware which data are/were shared and would ideally be able to opt out of such sharing.

## Highest Priority Considerations

Consumer privacy is paramount. While there are some scenarios where Consumer data is going to be identifiable (eg payment information, email address, phone number for SMS, etc), it is critical to design all data retention and access schemes to avoid correlation of Consumer identity and location, as well as identity and schedule, by default. While it is useful to know that A Consumer has a particular schedule and travels regularly from some origin to some destination, with distance to stops and other services included, it is not essential to know the actual identity of that Consumer.

## Specification Details

## External Reference Materials

- [RTC website](https://www.rtcsnv.com/ways-to-travel/transit-services/for-developers/)

## User Stories

**Terms**:

- **Consumer**: a bus rider, bike share user, and so on.
- **Operator**: a bus driver, and so on.
- **Controller**: a transit operations staff member, and so on.
- **Company**: a transit company, commission, or other agency overseeing transit services

User Stories are implemented as [GitHub Story Issues in the Overview Repository](https://github.com/InnovateForVegas/ov-open-transit/issues)
