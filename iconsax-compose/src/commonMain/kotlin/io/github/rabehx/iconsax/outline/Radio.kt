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

val Iconsax.Outline.Radio: ImageVector
    get() {
        if (_Radio != null) {
            return _Radio!!
        }
        _Radio = ImageVector.Builder(
            name = "Outline.Radio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(3.56f, 22.75f, 1.25f, 20.44f, 1.25f, 17f)
                verticalLineTo(10f)
                curveTo(1.25f, 6.56f, 3.56f, 4.25f, 7f, 4.25f)
                horizontalLineTo(17f)
                curveTo(20.44f, 4.25f, 22.75f, 6.56f, 22.75f, 10f)
                verticalLineTo(17f)
                curveTo(22.75f, 20.44f, 20.44f, 22.75f, 17f, 22.75f)
                close()
                moveTo(7f, 5.75f)
                curveTo(4.42f, 5.75f, 2.75f, 7.42f, 2.75f, 10f)
                verticalLineTo(17f)
                curveTo(2.75f, 19.58f, 4.42f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 17f)
                verticalLineTo(10f)
                curveTo(21.25f, 7.42f, 19.58f, 5.75f, 17f, 5.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 5.75f)
                curveTo(6.59f, 5.75f, 6.25f, 5.41f, 6.25f, 5f)
                verticalLineTo(2f)
                curveTo(6.25f, 1.59f, 6.59f, 1.25f, 7f, 1.25f)
                curveTo(7.41f, 1.25f, 7.75f, 1.59f, 7.75f, 2f)
                verticalLineTo(5f)
                curveTo(7.75f, 5.41f, 7.41f, 5.75f, 7f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 16.75f)
                curveTo(6.71f, 16.75f, 5.25f, 15.29f, 5.25f, 13.5f)
                curveTo(5.25f, 11.71f, 6.71f, 10.25f, 8.5f, 10.25f)
                curveTo(10.29f, 10.25f, 11.75f, 11.71f, 11.75f, 13.5f)
                curveTo(11.75f, 15.29f, 10.29f, 16.75f, 8.5f, 16.75f)
                close()
                moveTo(8.5f, 11.75f)
                curveTo(7.54f, 11.75f, 6.75f, 12.54f, 6.75f, 13.5f)
                curveTo(6.75f, 14.46f, 7.54f, 15.25f, 8.5f, 15.25f)
                curveTo(9.46f, 15.25f, 10.25f, 14.46f, 10.25f, 13.5f)
                curveTo(10.25f, 12.54f, 9.46f, 11.75f, 8.5f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 11.75f)
                horizontalLineTo(14.5f)
                curveTo(14.09f, 11.75f, 13.75f, 11.41f, 13.75f, 11f)
                curveTo(13.75f, 10.59f, 14.09f, 10.25f, 14.5f, 10.25f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 10.25f, 19.25f, 10.59f, 19.25f, 11f)
                curveTo(19.25f, 11.41f, 18.91f, 11.75f, 18.5f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.09f, 15.75f, 13.75f, 15.41f, 13.75f, 15f)
                curveTo(13.75f, 14.59f, 14.09f, 14.25f, 14.5f, 14.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 14.25f, 15.75f, 14.59f, 15.75f, 15f)
                curveTo(15.75f, 15.41f, 15.41f, 15.75f, 15f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 15.75f)
                horizontalLineTo(18f)
                curveTo(17.59f, 15.75f, 17.25f, 15.41f, 17.25f, 15f)
                curveTo(17.25f, 14.59f, 17.59f, 14.25f, 18f, 14.25f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 14.25f, 19.25f, 14.59f, 19.25f, 15f)
                curveTo(19.25f, 15.41f, 18.91f, 15.75f, 18.5f, 15.75f)
                close()
            }
        }.build()

        return _Radio!!
    }

@Suppress("ObjectPropertyName")
private var _Radio: ImageVector? = null
