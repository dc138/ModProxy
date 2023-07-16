# ModProxy

A simple minecraft mod for allowing 1.12+ modded servers, like forge or fabric, to connect to proxy networks.

Minecraft proxy software, like bungeecord and velocity, do not support proxying modern modded clients when server-side mods are in play.
This project attempts to circumvent this restriction by bypassing the proxy completely for modded servers.
It instead, once installed on both client and server, sends a custom packet to clients with all the information necessary for them to make the connection themselves.
Once the client leaves the other server, it will reconnect back to the proxy server.
For this to work, both client and proxy must have this mod installed.
This shouldn't really cause problems with servers running server-side mods, as those already require clients to install the server's modpack locally.

This project targets proxying situations only, i.e., when wanting to connect a modded server to an existing network.
This way, it only requires a plugin to be installed on the proxy server running the network, and on clients that whish to connect to the server in question.

## License

The code in this repository is licensed under the MIT license:

```
ModProxy, a simple minecraft mod for allowing 1.12+ modded clients to connect to proxy networks.
Copyright © 2023 Antonio de Haro

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the "Software"),
to deal in the Software without restriction, including without limitation
the rights to use, copy, modify, merge, publish, distribute, sublicense,
and/or sell copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included
in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```

