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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Scanning: ImageVector
    get() {
        if (_Scanning != null) {
            return _Scanning!!
        }
        _Scanning = ImageVector.Builder(
            name = "Outline.Scanning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                verticalLineTo(6.5f)
                curveTo(1.25f, 3.6f, 3.61f, 1.25f, 6.5f, 1.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 1.25f, 9.75f, 1.59f, 9.75f, 2f)
                curveTo(9.75f, 2.41f, 9.41f, 2.75f, 9f, 2.75f)
                horizontalLineTo(6.5f)
                curveTo(4.43f, 2.75f, 2.75f, 4.43f, 2.75f, 6.5f)
                verticalLineTo(9f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9f)
                verticalLineTo(6.5f)
                curveTo(21.25f, 4.43f, 19.57f, 2.75f, 17.5f, 2.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 2.75f, 14.25f, 2.41f, 14.25f, 2f)
                curveTo(14.25f, 1.59f, 14.59f, 1.25f, 15f, 1.25f)
                horizontalLineTo(17.5f)
                curveTo(20.39f, 1.25f, 22.75f, 3.6f, 22.75f, 6.5f)
                verticalLineTo(9f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 22.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 22.75f, 15.25f, 22.41f, 15.25f, 22f)
                curveTo(15.25f, 21.59f, 15.59f, 21.25f, 16f, 21.25f)
                horizontalLineTo(17.5f)
                curveTo(19.57f, 21.25f, 21.25f, 19.57f, 21.25f, 17.5f)
                verticalLineTo(16f)
                curveTo(21.25f, 15.59f, 21.59f, 15.25f, 22f, 15.25f)
                curveTo(22.41f, 15.25f, 22.75f, 15.59f, 22.75f, 16f)
                verticalLineTo(17.5f)
                curveTo(22.75f, 20.4f, 20.39f, 22.75f, 17.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22.75f)
                horizontalLineTo(6.5f)
                curveTo(3.61f, 22.75f, 1.25f, 20.4f, 1.25f, 17.5f)
                verticalLineTo(15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                curveTo(2.41f, 14.25f, 2.75f, 14.59f, 2.75f, 15f)
                verticalLineTo(17.5f)
                curveTo(2.75f, 19.57f, 4.43f, 21.25f, 6.5f, 21.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 21.25f, 9.75f, 21.59f, 9.75f, 22f)
                curveTo(9.75f, 22.41f, 9.41f, 22.75f, 9f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 11.75f)
                curveTo(6.71f, 11.75f, 5.25f, 10.29f, 5.25f, 8.5f)
                curveTo(5.25f, 6.71f, 6.71f, 5.25f, 8.5f, 5.25f)
                curveTo(10.29f, 5.25f, 11.75f, 6.71f, 11.75f, 8.5f)
                curveTo(11.75f, 10.29f, 10.29f, 11.75f, 8.5f, 11.75f)
                close()
                moveTo(8.5f, 6.75f)
                curveTo(7.54f, 6.75f, 6.75f, 7.54f, 6.75f, 8.5f)
                curveTo(6.75f, 9.46f, 7.54f, 10.25f, 8.5f, 10.25f)
                curveTo(9.46f, 10.25f, 10.25f, 9.46f, 10.25f, 8.5f)
                curveTo(10.25f, 7.54f, 9.46f, 6.75f, 8.5f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 18.75f)
                curveTo(6.26f, 18.75f, 5.25f, 17.74f, 5.25f, 16.5f)
                curveTo(5.25f, 15.26f, 6.26f, 14.25f, 7.5f, 14.25f)
                curveTo(8.74f, 14.25f, 9.75f, 15.26f, 9.75f, 16.5f)
                curveTo(9.75f, 17.74f, 8.74f, 18.75f, 7.5f, 18.75f)
                close()
                moveTo(7.5f, 15.75f)
                curveTo(7.09f, 15.75f, 6.75f, 16.09f, 6.75f, 16.5f)
                curveTo(6.75f, 16.91f, 7.09f, 17.25f, 7.5f, 17.25f)
                curveTo(7.91f, 17.25f, 8.25f, 16.91f, 8.25f, 16.5f)
                curveTo(8.25f, 16.09f, 7.91f, 15.75f, 7.5f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 9.75f)
                curveTo(15.26f, 9.75f, 14.25f, 8.74f, 14.25f, 7.5f)
                curveTo(14.25f, 6.26f, 15.26f, 5.25f, 16.5f, 5.25f)
                curveTo(17.74f, 5.25f, 18.75f, 6.26f, 18.75f, 7.5f)
                curveTo(18.75f, 8.74f, 17.74f, 9.75f, 16.5f, 9.75f)
                close()
                moveTo(16.5f, 6.75f)
                curveTo(16.09f, 6.75f, 15.75f, 7.09f, 15.75f, 7.5f)
                curveTo(15.75f, 7.91f, 16.09f, 8.25f, 16.5f, 8.25f)
                curveTo(16.91f, 8.25f, 17.25f, 7.91f, 17.25f, 7.5f)
                curveTo(17.25f, 7.09f, 16.91f, 6.75f, 16.5f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 18.75f)
                curveTo(13.71f, 18.75f, 12.25f, 17.29f, 12.25f, 15.5f)
                curveTo(12.25f, 13.71f, 13.71f, 12.25f, 15.5f, 12.25f)
                curveTo(17.29f, 12.25f, 18.75f, 13.71f, 18.75f, 15.5f)
                curveTo(18.75f, 17.29f, 17.29f, 18.75f, 15.5f, 18.75f)
                close()
                moveTo(15.5f, 13.75f)
                curveTo(14.54f, 13.75f, 13.75f, 14.54f, 13.75f, 15.5f)
                curveTo(13.75f, 16.46f, 14.54f, 17.25f, 15.5f, 17.25f)
                curveTo(16.46f, 17.25f, 17.25f, 16.46f, 17.25f, 15.5f)
                curveTo(17.25f, 14.54f, 16.46f, 13.75f, 15.5f, 13.75f)
                close()
            }
        }.build()

        return _Scanning!!
    }

@Suppress("ObjectPropertyName")
private var _Scanning: ImageVector? = null
