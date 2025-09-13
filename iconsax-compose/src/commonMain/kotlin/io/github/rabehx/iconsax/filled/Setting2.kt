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


val Iconsax.Filled.Setting2: ImageVector
    get() {
        if (_Setting2 != null) {
            return _Setting2!!
        }
        _Setting2 = ImageVector.Builder(
            name = "Filled.Setting2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.1f, 9.221f)
                curveTo(18.29f, 9.221f, 17.55f, 7.941f, 18.45f, 6.371f)
                curveTo(18.97f, 5.461f, 18.66f, 4.301f, 17.75f, 3.781f)
                lineTo(16.02f, 2.791f)
                curveTo(15.23f, 2.321f, 14.21f, 2.601f, 13.74f, 3.391f)
                lineTo(13.63f, 3.581f)
                curveTo(12.73f, 5.151f, 11.25f, 5.151f, 10.34f, 3.581f)
                lineTo(10.23f, 3.391f)
                curveTo(9.78f, 2.601f, 8.76f, 2.321f, 7.97f, 2.791f)
                lineTo(6.24f, 3.781f)
                curveTo(5.33f, 4.301f, 5.02f, 5.471f, 5.54f, 6.381f)
                curveTo(6.45f, 7.941f, 5.71f, 9.221f, 3.9f, 9.221f)
                curveTo(2.86f, 9.221f, 2f, 10.071f, 2f, 11.121f)
                verticalLineTo(12.881f)
                curveTo(2f, 13.921f, 2.85f, 14.781f, 3.9f, 14.781f)
                curveTo(5.71f, 14.781f, 6.45f, 16.061f, 5.54f, 17.631f)
                curveTo(5.02f, 18.541f, 5.33f, 19.701f, 6.24f, 20.221f)
                lineTo(7.97f, 21.211f)
                curveTo(8.76f, 21.681f, 9.78f, 21.401f, 10.25f, 20.611f)
                lineTo(10.36f, 20.421f)
                curveTo(11.26f, 18.851f, 12.74f, 18.851f, 13.65f, 20.421f)
                lineTo(13.76f, 20.611f)
                curveTo(14.23f, 21.401f, 15.25f, 21.681f, 16.04f, 21.211f)
                lineTo(17.77f, 20.221f)
                curveTo(18.68f, 19.701f, 18.99f, 18.531f, 18.47f, 17.631f)
                curveTo(17.56f, 16.061f, 18.3f, 14.781f, 20.11f, 14.781f)
                curveTo(21.15f, 14.781f, 22.01f, 13.931f, 22.01f, 12.881f)
                verticalLineTo(11.121f)
                curveTo(22f, 10.081f, 21.15f, 9.221f, 20.1f, 9.221f)
                close()
                moveTo(12f, 15.251f)
                curveTo(10.21f, 15.251f, 8.75f, 13.791f, 8.75f, 12.001f)
                curveTo(8.75f, 10.211f, 10.21f, 8.751f, 12f, 8.751f)
                curveTo(13.79f, 8.751f, 15.25f, 10.211f, 15.25f, 12.001f)
                curveTo(15.25f, 13.791f, 13.79f, 15.251f, 12f, 15.251f)
                close()
            }
        }.build()

        return _Setting2!!
    }

@Suppress("ObjectPropertyName")
private var _Setting2: ImageVector? = null
