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

# Open Transit Operator Client

We assume that a *Public Transit Operators* (Drivers, Maintenance, others working within or for the transit infrastructure) is managing operating or maintaining one or more systems (vehicles, bikes, bike racks, etc) as well as Consumer engagements as well as Controller engagements. While the Operator Client may be viewed as a cross-platform application similar to the Consumer or Controller clients, in fact it is entirely possible that some functionality is implemented in an alternate interface (a button panel on board a bus) to avoid driver distraction and to satisfy other possible requirements.

## Highest Priority Considerations

In the case of an Operator driving a vehicle (a bus or other), driver distraction is to be avoided above all other considerations. At no time should an Operator be required to redirect attention to the Operator Client in such a manner as they are distracted from safely operating the vehicle in motion (or even at rest). It would be possible to implement some Operator interfaces via a control panel with buttons or other devices that would minimize distraction but enable notifications and other interactions.

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

- **Card**: As an Operator, I need to receive and provide status updates on my route and about my vehicle and passengers throughout a trip from beginning to end of line, minimizing or eliminating any driver distractions in so doing.
  - **Conversation**: Operators may receive status updates from Controllers via voice radio or perhaps less urgently, via a textual or other visual messaging scheme. Operators may as well need to provide status information to controllers asynchronously, instead of or in addition to voice communications via radio.
  - **Confirmation**:
    - Operator is able to send and receive non-distracting, relevant information to and from Controller or related servers and services.

---
