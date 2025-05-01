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


val Iconsax.Filled.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Filled.Star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.389f, 5.211f)
                lineTo(16.799f, 8.031f)
                curveTo(16.99f, 8.421f, 17.5f, 8.791f, 17.93f, 8.871f)
                lineTo(20.479f, 9.291f)
                curveTo(22.11f, 9.561f, 22.49f, 10.741f, 21.319f, 11.921f)
                lineTo(19.33f, 13.911f)
                curveTo(19f, 14.241f, 18.809f, 14.891f, 18.92f, 15.361f)
                lineTo(19.49f, 17.821f)
                curveTo(19.94f, 19.761f, 18.899f, 20.521f, 17.19f, 19.501f)
                lineTo(14.8f, 18.081f)
                curveTo(14.37f, 17.821f, 13.649f, 17.821f, 13.219f, 18.081f)
                lineTo(10.83f, 19.501f)
                curveTo(9.119f, 20.511f, 8.079f, 19.761f, 8.529f, 17.821f)
                lineTo(9.099f, 15.361f)
                curveTo(9.189f, 14.881f, 8.999f, 14.231f, 8.669f, 13.901f)
                lineTo(6.679f, 11.911f)
                curveTo(5.509f, 10.741f, 5.889f, 9.561f, 7.519f, 9.281f)
                lineTo(10.069f, 8.861f)
                curveTo(10.5f, 8.791f, 11.009f, 8.411f, 11.2f, 8.021f)
                lineTo(12.609f, 5.201f)
                curveTo(13.38f, 3.681f, 14.62f, 3.681f, 15.389f, 5.211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 5.75f, 1.25f, 5.41f, 1.25f, 5f)
                curveTo(1.25f, 4.59f, 1.59f, 4.25f, 2f, 4.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 4.25f, 8.75f, 4.59f, 8.75f, 5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 19.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 19.75f, 1.25f, 19.41f, 1.25f, 19f)
                curveTo(1.25f, 18.59f, 1.59f, 18.25f, 2f, 18.25f)
                horizontalLineTo(5f)
                curveTo(5.41f, 18.25f, 5.75f, 18.59f, 5.75f, 19f)
                curveTo(5.75f, 19.41f, 5.41f, 19.75f, 5f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(3f)
                curveTo(3.41f, 11.25f, 3.75f, 11.59f, 3.75f, 12f)
                curveTo(3.75f, 12.41f, 3.41f, 12.75f, 3f, 12.75f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
