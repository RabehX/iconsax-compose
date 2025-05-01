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


val Iconsax.Filled.DocumentCopy: ImageVector
    get() {
        if (_DocumentCopy != null) {
            return _DocumentCopy!!
        }
        _DocumentCopy = ImageVector.Builder(
            name = "Filled.DocumentCopy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 13.15f)
                horizontalLineTo(13.33f)
                curveTo(11.55f, 13.15f, 10.1f, 11.71f, 10.1f, 9.92f)
                verticalLineTo(7.75f)
                curveTo(10.1f, 7.34f, 9.77f, 7f, 9.35f, 7f)
                horizontalLineTo(6.18f)
                curveTo(3.87f, 7f, 2f, 8.5f, 2f, 11.18f)
                verticalLineTo(17.82f)
                curveTo(2f, 20.5f, 3.87f, 22f, 6.18f, 22f)
                horizontalLineTo(12.07f)
                curveTo(14.38f, 22f, 16.25f, 20.5f, 16.25f, 17.82f)
                verticalLineTo(13.9f)
                curveTo(16.25f, 13.48f, 15.91f, 13.15f, 15.5f, 13.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.82f, 2f)
                horizontalLineTo(15.85f)
                horizontalLineTo(14.76f)
                horizontalLineTo(11.93f)
                curveTo(9.67f, 2f, 7.84f, 3.44f, 7.76f, 6.01f)
                curveTo(7.82f, 6.01f, 7.87f, 6f, 7.93f, 6f)
                horizontalLineTo(10.76f)
                horizontalLineTo(11.85f)
                horizontalLineTo(13.82f)
                curveTo(16.13f, 6f, 18f, 7.5f, 18f, 10.18f)
                verticalLineTo(12.15f)
                verticalLineTo(14.86f)
                verticalLineTo(16.83f)
                curveTo(18f, 16.89f, 17.99f, 16.94f, 17.99f, 16.99f)
                curveTo(20.22f, 16.92f, 22f, 15.44f, 22f, 12.83f)
                verticalLineTo(10.86f)
                verticalLineTo(8.15f)
                verticalLineTo(6.18f)
                curveTo(22f, 3.5f, 20.13f, 2f, 17.82f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.981f, 7.152f)
                curveTo(11.671f, 6.842f, 11.141f, 7.052f, 11.141f, 7.482f)
                verticalLineTo(10.102f)
                curveTo(11.141f, 11.202f, 12.071f, 12.102f, 13.211f, 12.102f)
                curveTo(13.921f, 12.112f, 14.911f, 12.112f, 15.761f, 12.112f)
                curveTo(16.191f, 12.112f, 16.411f, 11.612f, 16.111f, 11.312f)
                curveTo(15.021f, 10.222f, 13.081f, 8.272f, 11.981f, 7.152f)
                close()
            }
        }.build()

        return _DocumentCopy!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCopy: ImageVector? = null
