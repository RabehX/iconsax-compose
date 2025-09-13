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


val Iconsax.Filled.Triangle: ImageVector
    get() {
        if (_Triangle != null) {
            return _Triangle!!
        }
        _Triangle = ImageVector.Builder(
            name = "Filled.Triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 3.899f)
                verticalLineTo(12.919f)
                curveTo(11.25f, 13.249f, 11.09f, 13.549f, 10.82f, 13.739f)
                lineTo(3.61f, 18.789f)
                curveTo(3.02f, 19.199f, 2.18f, 18.879f, 2.05f, 18.169f)
                curveTo(1.9f, 17.309f, 2.1f, 16.299f, 2.7f, 15.209f)
                lineTo(5.82f, 9.599f)
                lineTo(8.76f, 4.309f)
                curveTo(8.99f, 3.899f, 9.24f, 3.539f, 9.5f, 3.229f)
                curveTo(10.1f, 2.529f, 11.25f, 2.979f, 11.25f, 3.899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.39f, 18.789f)
                lineTo(13.18f, 13.739f)
                curveTo(12.91f, 13.549f, 12.75f, 13.249f, 12.75f, 12.919f)
                verticalLineTo(3.899f)
                curveTo(12.75f, 2.979f, 13.9f, 2.529f, 14.5f, 3.229f)
                curveTo(14.76f, 3.539f, 15.01f, 3.899f, 15.24f, 4.309f)
                lineTo(18.18f, 9.599f)
                lineTo(21.3f, 15.209f)
                curveTo(21.9f, 16.299f, 22.1f, 17.309f, 21.95f, 18.169f)
                curveTo(21.82f, 18.879f, 20.98f, 19.199f, 20.39f, 18.789f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.26f, 19.14f)
                lineTo(11.41f, 15.04f)
                curveTo(11.74f, 14.82f, 12.28f, 14.82f, 12.61f, 15.04f)
                lineTo(18.76f, 19.14f)
                curveTo(20.39f, 20.23f, 20.12f, 21.12f, 18.16f, 21.12f)
                horizontalLineTo(5.85f)
                curveTo(3.9f, 21.11f, 3.63f, 20.22f, 5.26f, 19.14f)
                close()
            }
        }.build()

        return _Triangle!!
    }

@Suppress("ObjectPropertyName")
private var _Triangle: ImageVector? = null
