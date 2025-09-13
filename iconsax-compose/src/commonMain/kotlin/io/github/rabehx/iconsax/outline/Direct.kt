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

val Iconsax.Outline.Direct: ImageVector
    get() {
        if (_Direct != null) {
            return _Direct!!
        }
        _Direct = ImageVector.Builder(
            name = "Outline.Direct",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.76f, 17.75f)
                horizontalLineTo(10.23f)
                curveTo(9.13f, 17.75f, 8.26f, 17.21f, 7.77f, 16.23f)
                lineTo(6.88f, 14.44f)
                curveTo(6.67f, 14.01f, 6.24f, 13.75f, 5.76f, 13.75f)
                horizontalLineTo(1.99f)
                curveTo(1.58f, 13.75f, 1.24f, 13.41f, 1.24f, 13f)
                curveTo(1.24f, 12.59f, 1.59f, 12.25f, 2f, 12.25f)
                horizontalLineTo(5.76f)
                curveTo(6.81f, 12.25f, 7.75f, 12.83f, 8.22f, 13.77f)
                lineTo(9.11f, 15.56f)
                curveTo(9.34f, 16.02f, 9.71f, 16.25f, 10.23f, 16.25f)
                horizontalLineTo(13.76f)
                curveTo(14.24f, 16.25f, 14.67f, 15.99f, 14.88f, 15.56f)
                lineTo(15.77f, 13.77f)
                curveTo(16.24f, 12.83f, 17.18f, 12.25f, 18.23f, 12.25f)
                horizontalLineTo(21.97f)
                curveTo(22.38f, 12.25f, 22.72f, 12.59f, 22.72f, 13f)
                curveTo(22.72f, 13.41f, 22.38f, 13.75f, 21.97f, 13.75f)
                horizontalLineTo(18.23f)
                curveTo(17.75f, 13.75f, 17.32f, 14.01f, 17.11f, 14.44f)
                lineTo(16.22f, 16.23f)
                curveTo(15.75f, 17.17f, 14.81f, 17.75f, 13.76f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.67f, 7.75f)
                horizontalLineTo(10.34f)
                curveTo(9.92f, 7.75f, 9.58f, 7.41f, 9.58f, 7f)
                curveTo(9.58f, 6.59f, 9.92f, 6.25f, 10.33f, 6.25f)
                horizontalLineTo(13.66f)
                curveTo(14.07f, 6.25f, 14.41f, 6.59f, 14.41f, 7f)
                curveTo(14.41f, 7.41f, 14.08f, 7.75f, 13.67f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 10.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 10.75f, 8.75f, 10.41f, 8.75f, 10f)
                curveTo(8.75f, 9.59f, 9.09f, 9.25f, 9.5f, 9.25f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 9.25f, 15.25f, 9.59f, 15.25f, 10f)
                curveTo(15.25f, 10.41f, 14.91f, 10.75f, 14.5f, 10.75f)
                close()
            }
        }.build()

        return _Direct!!
    }

@Suppress("ObjectPropertyName")
private var _Direct: ImageVector? = null
