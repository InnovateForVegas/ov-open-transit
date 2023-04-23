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

# Open Transit Operator Client

We assume that a *Public Transit Operators* (Drivers, Maintenance, others working within or for the transit infrastructure) is managing operating or maintaining one or more systems (vehicles, bikes, bike racks, etc) as well as Consumer engagements as well as Controller engagements. While the Operator Client may be viewed as a cross-platform application similar to the Consumer or Controller clients, in fact it is entirely possible that some functionality is implemented in an alternate interface (a button panel on board a bus) to avoid driver distraction and to satisfy other possible requirements.

## Highest Priority Considerations

In the case of an Operator driving a vehicle (a bus or other), driver distraction is to be avoided above all other considerations. At no time should an Operator be required to redirect attention to the Operator Client in such a manner as they are distracted from safely operating the vehicle in motion (or even at rest). It would be possible to implement some Operator interfaces via a control panel with buttons or other devices that would minimize distraction but enable notifications and other interactions.

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
