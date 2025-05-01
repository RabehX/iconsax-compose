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

val Iconsax.Outline.CardAdd: ImageVector
    get() {
        if (_CardAdd != null) {
            return _CardAdd!!
        }
        _CardAdd = ImageVector.Builder(
            name = "Outline.CardAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 9.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 9.25f, 1.25f, 8.91f, 1.25f, 8.5f)
                curveTo(1.25f, 8.09f, 1.59f, 7.75f, 2f, 7.75f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 7.75f, 14.25f, 8.09f, 14.25f, 8.5f)
                curveTo(14.25f, 8.91f, 13.91f, 9.25f, 13.5f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 17.25f)
                horizontalLineTo(6f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6f, 15.75f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.56f, 21.25f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 21.25f, 1.25f, 20.05f, 1.25f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.25f, 3.95f, 2.46f, 2.75f, 6.44f, 2.75f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 2.75f, 14.25f, 3.09f, 14.25f, 3.5f)
                curveTo(14.25f, 3.91f, 13.91f, 4.25f, 13.5f, 4.25f)
                horizontalLineTo(6.44f)
                curveTo(3.3f, 4.25f, 2.75f, 4.79f, 2.75f, 7.89f)
                verticalLineTo(16.1f)
                curveTo(2.75f, 19.2f, 3.3f, 19.74f, 6.44f, 19.74f)
                horizontalLineTo(17.55f)
                curveTo(20.69f, 19.74f, 21.24f, 19.2f, 21.24f, 16.1f)
                verticalLineTo(12.02f)
                curveTo(21.24f, 11.61f, 21.58f, 11.27f, 21.99f, 11.27f)
                curveTo(22.4f, 11.27f, 22.74f, 11.61f, 22.74f, 12.02f)
                verticalLineTo(16.1f)
                curveTo(22.75f, 20.05f, 21.54f, 21.25f, 17.56f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7f)
                horizontalLineTo(16.5f)
                curveTo(16.09f, 7f, 15.75f, 6.66f, 15.75f, 6.25f)
                curveTo(15.75f, 5.84f, 16.09f, 5.5f, 16.5f, 5.5f)
                horizontalLineTo(22f)
                curveTo(22.41f, 5.5f, 22.75f, 5.84f, 22.75f, 6.25f)
                curveTo(22.75f, 6.66f, 22.41f, 7f, 22f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.25f, 9.75f)
                curveTo(18.84f, 9.75f, 18.5f, 9.41f, 18.5f, 9f)
                verticalLineTo(3.5f)
                curveTo(18.5f, 3.09f, 18.84f, 2.75f, 19.25f, 2.75f)
                curveTo(19.66f, 2.75f, 20f, 3.09f, 20f, 3.5f)
                verticalLineTo(9f)
                curveTo(20f, 9.41f, 19.66f, 9.75f, 19.25f, 9.75f)
                close()
            }
        }.build()

        return _CardAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CardAdd: ImageVector? = null
