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


val Iconsax.Filled.Sort: ImageVector
    get() {
        if (_Sort != null) {
            return _Sort!!
        }
        _Sort = ImageVector.Builder(
            name = "Filled.Sort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(13.33f, 17f)
                horizontalLineTo(10.66f)
                curveTo(10.25f, 17f, 9.91f, 16.66f, 9.91f, 16.25f)
                curveTo(9.91f, 15.84f, 10.25f, 15.5f, 10.66f, 15.5f)
                horizontalLineTo(13.33f)
                curveTo(13.74f, 15.5f, 14.08f, 15.84f, 14.08f, 16.25f)
                curveTo(14.08f, 16.66f, 13.75f, 17f, 13.33f, 17f)
                close()
                moveTo(16f, 12.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8f, 11.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16f, 12.75f)
                close()
                moveTo(18f, 8.5f)
                horizontalLineTo(6f)
                curveTo(5.59f, 8.5f, 5.25f, 8.16f, 5.25f, 7.75f)
                curveTo(5.25f, 7.34f, 5.59f, 7f, 6f, 7f)
                horizontalLineTo(18f)
                curveTo(18.41f, 7f, 18.75f, 7.34f, 18.75f, 7.75f)
                curveTo(18.75f, 8.16f, 18.41f, 8.5f, 18f, 8.5f)
                close()
            }
        }.build()

        return _Sort!!
    }

@Suppress("ObjectPropertyName")
private var _Sort: ImageVector? = null
