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


val Iconsax.Filled.SafeHome: ImageVector
    get() {
        if (_SafeHome != null) {
            return _SafeHome!!
        }
        _SafeHome = ImageVector.Builder(
            name = "Filled.SafeHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(23f, 15.371f)
                verticalLineTo(17.561f)
                curveTo(23f, 20.001f, 21.22f, 22.301f, 18.8f, 22.971f)
                curveTo(18.63f, 23.011f, 18.45f, 23.011f, 18.29f, 22.971f)
                curveTo(17.11f, 22.651f, 16.07f, 21.931f, 15.34f, 21.001f)
                curveTo(14.55f, 20.021f, 14.09f, 18.811f, 14.09f, 17.561f)
                verticalLineTo(15.371f)
                curveTo(14.09f, 14.951f, 14.4f, 14.491f, 14.78f, 14.331f)
                lineTo(17.56f, 13.191f)
                curveTo(18.19f, 12.941f, 18.89f, 12.941f, 19.52f, 13.191f)
                lineTo(20.52f, 13.601f)
                lineTo(22.31f, 14.331f)
                curveTo(22.69f, 14.491f, 23f, 14.951f, 23f, 15.371f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.949f, 11.011f)
                lineTo(20.769f, 12.081f)
                lineTo(20.069f, 11.801f)
                curveTo(19.079f, 11.401f, 17.999f, 11.401f, 16.989f, 11.801f)
                lineTo(14.199f, 12.951f)
                curveTo(13.249f, 13.351f, 12.589f, 14.341f, 12.589f, 15.371f)
                verticalLineTo(17.561f)
                curveTo(12.589f, 18.751f, 12.919f, 19.941f, 13.529f, 21.001f)
                horizontalLineTo(6.179f)
                curveTo(4.809f, 21.001f, 3.519f, 19.911f, 3.289f, 18.561f)
                lineTo(2.029f, 11.011f)
                curveTo(1.869f, 10.081f, 2.339f, 8.831f, 3.079f, 8.241f)
                lineTo(9.659f, 2.981f)
                curveTo(10.669f, 2.171f, 12.309f, 2.171f, 13.319f, 2.991f)
                lineTo(19.899f, 8.241f)
                curveTo(20.629f, 8.831f, 21.109f, 10.081f, 20.949f, 11.011f)
                close()
            }
        }.build()

        return _SafeHome!!
    }

@Suppress("ObjectPropertyName")
private var _SafeHome: ImageVector? = null
