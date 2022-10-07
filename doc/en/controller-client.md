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

# Open Transit Controller Tools

We assume that a *Public Transit Controller* (Operations Staff) is overseeing day-to-day functionality of individual vehicles, aggregate grid performance over particular time intervals, real-time route changes due to detour, traffic delays, rider services, rider issues, and so on.

## Highest Priority Considerations

The ability to access current information from multiple sources and provide a nearly-real-time situation update to any Controller is paramount. Any Controller may need to re-route one or more vehicles, receive information that one or more vehicles have been re-routed due to real-time circumstances, receive information concerning equipment failures or collisions or other route failures, information about shared bike failures or thefts, rider issues… as such, the interfaces for the Controller Client should be optimized for particular situational awareness and render data accordingly.

## Specification Details

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

- **Card**: As a Controller, I need to know the status (location, velocity, capacity) of each vehicle and to see or hear that information in usable and adjustable ways.
  - **Conversation**: A Controller overseeing an operating transit environment must be able to observe all observable data in totality or in faceted or factored views to focus on particular to drill down into a particular situation or scenario.
  - **Confirmation**:
    - Controller is able to observe real time data from Real Time Server, feedback from Consumer Server, and status indicators from Operators to assess a current high level transit status.\
    - Controller is able to observe a single vehicle, single stop, single map grid, and so on for more focused and detailed assessments.

---
