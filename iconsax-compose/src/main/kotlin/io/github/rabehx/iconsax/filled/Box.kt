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


val Iconsax.Filled.Box: ImageVector
    get() {
        if (_Box != null) {
            return _Box!!
        }
        _Box = ImageVector.Builder(
            name = "Filled.Box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.208f, 7.821f)
                lineTo(12.508f, 12.281f)
                curveTo(12.198f, 12.461f, 11.808f, 12.461f, 11.488f, 12.281f)
                lineTo(3.788f, 7.821f)
                curveTo(3.238f, 7.501f, 3.098f, 6.751f, 3.518f, 6.281f)
                curveTo(3.808f, 5.951f, 4.138f, 5.681f, 4.488f, 5.491f)
                lineTo(9.908f, 2.491f)
                curveTo(11.068f, 1.841f, 12.948f, 1.841f, 14.108f, 2.491f)
                lineTo(19.528f, 5.491f)
                curveTo(19.878f, 5.681f, 20.208f, 5.961f, 20.498f, 6.281f)
                curveTo(20.898f, 6.751f, 20.758f, 7.501f, 20.208f, 7.821f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.431f, 14.139f)
                verticalLineTo(20.959f)
                curveTo(11.431f, 21.719f, 10.66f, 22.219f, 9.98f, 21.889f)
                curveTo(7.92f, 20.879f, 4.45f, 18.989f, 4.45f, 18.989f)
                curveTo(3.23f, 18.299f, 2.23f, 16.559f, 2.23f, 15.129f)
                verticalLineTo(9.969f)
                curveTo(2.23f, 9.179f, 3.06f, 8.679f, 3.74f, 9.069f)
                lineTo(10.931f, 13.239f)
                curveTo(11.231f, 13.429f, 11.431f, 13.769f, 11.431f, 14.139f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.57f, 14.139f)
                verticalLineTo(20.959f)
                curveTo(12.57f, 21.719f, 13.34f, 22.219f, 14.02f, 21.889f)
                curveTo(16.08f, 20.879f, 19.55f, 18.989f, 19.55f, 18.989f)
                curveTo(20.77f, 18.299f, 21.77f, 16.559f, 21.77f, 15.129f)
                verticalLineTo(9.969f)
                curveTo(21.77f, 9.179f, 20.94f, 8.679f, 20.26f, 9.069f)
                lineTo(13.07f, 13.239f)
                curveTo(12.77f, 13.429f, 12.57f, 13.769f, 12.57f, 14.139f)
                close()
            }
        }.build()

        return _Box!!
    }

@Suppress("ObjectPropertyName")
private var _Box: ImageVector? = null
