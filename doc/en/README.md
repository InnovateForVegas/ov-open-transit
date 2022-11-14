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

# Open Transit Project Specification

The Open Transit project is composed of several components, each ideally developed on a platform that serves the required function and performance, and which can interoperate with other components in a language agnostic fashion.

The specification is broken down along those component lines with the following (with links to individual local specification files):

| Component                                        | Description                                     |
|--------------------------------------------------|-------------------------------------------------|
| [Consumer Client](consumer-client.md)            | Front end for transit consumers                 |
| [Operator Client](operator-client.md)            | Front end for transit operators (drivers et al) |
| [Controller Client](controller-client.md)        | Front end for transit operations controllers    |
| [Static Server](static-server.md)                | Back end schedule/route/stop/etc service        |
| [Real Time Server](real-time-server.md)          | Back end real time data service                 |
| [Real Time Estimator](real-time-estimator.md)    | Estimate real time next-stop times              |
| [Consumer Server](consumer-server.md)            | Rider-facing services, data stores, stats       |
| [Open Data](open-data.md)                        | Making Open Transit data Open Data              |
| [General References](references.md)              | General reference information, links, etc       |
