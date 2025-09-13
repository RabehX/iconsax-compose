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


val Iconsax.Filled.Teacher: ImageVector
    get() {
        if (_Teacher != null) {
            return _Teacher!!
        }
        _Teacher = ImageVector.Builder(
            name = "Filled.Teacher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.831f, 15.64f)
                curveTo(17.501f, 15.2f, 18.381f, 15.68f, 18.381f, 16.48f)
                verticalLineTo(17.77f)
                curveTo(18.381f, 19.04f, 17.391f, 20.4f, 16.201f, 20.8f)
                lineTo(13.011f, 21.86f)
                curveTo(12.451f, 22.05f, 11.541f, 22.05f, 10.991f, 21.86f)
                lineTo(7.801f, 20.8f)
                curveTo(6.601f, 20.4f, 5.621f, 19.04f, 5.621f, 17.77f)
                verticalLineTo(16.47f)
                curveTo(5.621f, 15.68f, 6.501f, 15.2f, 7.161f, 15.63f)
                lineTo(9.221f, 16.97f)
                curveTo(10.011f, 17.5f, 11.011f, 17.76f, 12.011f, 17.76f)
                curveTo(13.011f, 17.76f, 14.011f, 17.5f, 14.801f, 16.97f)
                lineTo(16.831f, 15.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.979f, 6.459f)
                lineTo(13.99f, 2.529f)
                curveTo(12.91f, 1.819f, 11.13f, 1.819f, 10.05f, 2.529f)
                lineTo(4.03f, 6.459f)
                curveTo(2.1f, 7.709f, 2.1f, 10.539f, 4.03f, 11.799f)
                lineTo(5.63f, 12.839f)
                lineTo(10.05f, 15.719f)
                curveTo(11.13f, 16.429f, 12.91f, 16.429f, 13.99f, 15.719f)
                lineTo(18.379f, 12.839f)
                lineTo(19.75f, 11.939f)
                verticalLineTo(14.999f)
                curveTo(19.75f, 15.409f, 20.09f, 15.749f, 20.5f, 15.749f)
                curveTo(20.91f, 15.749f, 21.25f, 15.409f, 21.25f, 14.999f)
                verticalLineTo(10.079f)
                curveTo(21.649f, 8.789f, 21.24f, 7.289f, 19.979f, 6.459f)
                close()
            }
        }.build()

        return _Teacher!!
    }

@Suppress("ObjectPropertyName")
private var _Teacher: ImageVector? = null
