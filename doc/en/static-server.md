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

# Open Transit Static Server

We assume that the overall transit system has several completely static and slow-to-change elements that are measured and reported, internally and externally, for use in generating schedules, maps, reports, and user interfaces for bus, bike share, and other modes.

## Highest Priority Considerations

While the data may be mostly static, there will be instances where a static element must be changed temporarily (a bus stop that is blocked due to construction, a route that is altered for a special event or other obstructions, a bike share bike rack that is out of service, etc), it is critical in these cases that elements that might be considered static, that all parties be alerted to changes in situ.

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

- **Card**: As a Consumer, I need to know the locations of bus stops and the routes that buses follow to determine my transit options.
  - **Conversation**: Each consumer of transit services has their own journey to make from their actual point of origin to their particular destinations with various waypoints. It is important that a Consumer is able to locate and reach stops on a well-traveled path and while out and about on new adventures.
  - **Confirmation**:
    - Consumer is able to locate nearest bus stops and correct route schedules with current detour and schedule change information clearly available.

---
