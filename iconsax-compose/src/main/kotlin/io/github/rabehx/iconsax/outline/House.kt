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

val Iconsax.Outline.House: ImageVector
    get() {
        if (_House != null) {
            return _House!!
        }
        _House = ImageVector.Builder(
            name = "Outline.House",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.7f, 22f)
                horizontalLineTo(2.2f)
                lineTo(2.25f, 9.97f)
                curveTo(2.25f, 9.12f, 2.64f, 8.33f, 3.31f, 7.81f)
                lineTo(10.31f, 2.36f)
                curveTo(11.3f, 1.59f, 12.69f, 1.59f, 13.69f, 2.36f)
                lineTo(20.69f, 7.8f)
                curveTo(21.35f, 8.32f, 21.75f, 9.13f, 21.75f, 9.97f)
                verticalLineTo(22f)
                horizontalLineTo(20.25f)
                verticalLineTo(9.98f)
                curveTo(20.25f, 9.6f, 20.07f, 9.23f, 19.77f, 8.99f)
                lineTo(12.77f, 3.55f)
                curveTo(12.32f, 3.2f, 11.69f, 3.2f, 11.23f, 3.55f)
                lineTo(4.23f, 9f)
                curveTo(3.93f, 9.23f, 3.75f, 9.6f, 3.75f, 9.98f)
                lineTo(3.7f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 22.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 22.75f, 8.75f, 22.41f, 8.75f, 22f)
                verticalLineTo(18.5f)
                curveTo(8.75f, 17.26f, 9.76f, 16.25f, 11f, 16.25f)
                horizontalLineTo(13f)
                curveTo(14.24f, 16.25f, 15.25f, 17.26f, 15.25f, 18.5f)
                verticalLineTo(22f)
                curveTo(15.25f, 22.41f, 14.91f, 22.75f, 14.5f, 22.75f)
                close()
                moveTo(10.25f, 21.25f)
                horizontalLineTo(13.75f)
                verticalLineTo(18.5f)
                curveTo(13.75f, 18.09f, 13.41f, 17.75f, 13f, 17.75f)
                horizontalLineTo(11f)
                curveTo(10.59f, 17.75f, 10.25f, 18.09f, 10.25f, 18.5f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 14.5f)
                horizontalLineTo(7.5f)
                curveTo(6.54f, 14.5f, 5.75f, 13.71f, 5.75f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(5.75f, 10.29f, 6.54f, 9.5f, 7.5f, 9.5f)
                horizontalLineTo(9.5f)
                curveTo(10.46f, 9.5f, 11.25f, 10.29f, 11.25f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(11.25f, 13.71f, 10.46f, 14.5f, 9.5f, 14.5f)
                close()
                moveTo(7.5f, 11f)
                curveTo(7.36f, 11f, 7.25f, 11.11f, 7.25f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(7.25f, 12.89f, 7.36f, 13f, 7.5f, 13f)
                horizontalLineTo(9.5f)
                curveTo(9.64f, 13f, 9.75f, 12.89f, 9.75f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(9.75f, 11.11f, 9.64f, 11f, 9.5f, 11f)
                horizontalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 14.5f)
                horizontalLineTo(14.5f)
                curveTo(13.54f, 14.5f, 12.75f, 13.71f, 12.75f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(12.75f, 10.29f, 13.54f, 9.5f, 14.5f, 9.5f)
                horizontalLineTo(16.5f)
                curveTo(17.46f, 9.5f, 18.25f, 10.29f, 18.25f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(18.25f, 13.71f, 17.46f, 14.5f, 16.5f, 14.5f)
                close()
                moveTo(14.5f, 11f)
                curveTo(14.36f, 11f, 14.25f, 11.11f, 14.25f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(14.25f, 12.89f, 14.36f, 13f, 14.5f, 13f)
                horizontalLineTo(16.5f)
                curveTo(16.64f, 13f, 16.75f, 12.89f, 16.75f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(16.75f, 11.11f, 16.64f, 11f, 16.5f, 11f)
                horizontalLineTo(14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 7.75f)
                curveTo(18.59f, 7.75f, 18.25f, 7.42f, 18.25f, 7.01f)
                lineTo(18.23f, 4.75f)
                horizontalLineTo(14.58f)
                curveTo(14.17f, 4.75f, 13.83f, 4.41f, 13.83f, 4f)
                curveTo(13.83f, 3.59f, 14.17f, 3.25f, 14.58f, 3.25f)
                horizontalLineTo(18.98f)
                curveTo(19.39f, 3.25f, 19.73f, 3.58f, 19.73f, 3.99f)
                lineTo(19.76f, 6.99f)
                curveTo(19.75f, 7.41f, 19.42f, 7.75f, 19f, 7.75f)
                curveTo(19.01f, 7.75f, 19f, 7.75f, 19f, 7.75f)
                close()
            }
        }.build()

        return _House!!
    }

@Suppress("ObjectPropertyName")
private var _House: ImageVector? = null
