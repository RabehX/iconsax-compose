/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Slash: ImageVector
    get() {
        if (_Slash != null) {
            return _Slash!!
        }
        _Slash = ImageVector.Builder(
            name = "Filled.Slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.53f, 5.53f)
                lineTo(5.53f, 19.53f)
                curveTo(5.51f, 19.55f, 5.5f, 19.56f, 5.48f, 19.57f)
                curveTo(5.1f, 19.25f, 4.75f, 18.9f, 4.43f, 18.52f)
                curveTo(2.91f, 16.77f, 2f, 14.49f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                curveTo(14.49f, 2f, 16.77f, 2.91f, 18.52f, 4.43f)
                curveTo(18.9f, 4.75f, 19.25f, 5.1f, 19.57f, 5.48f)
                curveTo(19.56f, 5.5f, 19.55f, 5.51f, 19.53f, 5.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 12.001f)
                curveTo(22.001f, 17.491f, 17.491f, 22.001f, 12.001f, 22.001f)
                curveTo(10.501f, 22.001f, 9.081f, 21.671f, 7.801f, 21.071f)
                curveTo(7.181f, 20.781f, 7.061f, 19.951f, 7.541f, 19.461f)
                lineTo(19.461f, 7.541f)
                curveTo(19.941f, 7.061f, 20.781f, 7.181f, 21.071f, 7.801f)
                curveTo(21.671f, 9.071f, 22.001f, 10.501f, 22.001f, 12.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.771f, 2.229f)
                curveTo(21.471f, 1.929f, 20.981f, 1.929f, 20.681f, 2.229f)
                lineTo(2.231f, 20.689f)
                curveTo(1.931f, 20.989f, 1.931f, 21.479f, 2.231f, 21.779f)
                curveTo(2.381f, 21.919f, 2.571f, 21.999f, 2.771f, 21.999f)
                curveTo(2.971f, 21.999f, 3.161f, 21.919f, 3.311f, 21.769f)
                lineTo(21.771f, 3.309f)
                curveTo(22.081f, 3.009f, 22.081f, 2.529f, 21.771f, 2.229f)
                close()
            }
        }.build()

        return _Slash!!
    }

@Suppress("ObjectPropertyName")
private var _Slash: ImageVector? = null
