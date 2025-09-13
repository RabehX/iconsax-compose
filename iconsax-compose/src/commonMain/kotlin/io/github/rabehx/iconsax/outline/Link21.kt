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

val Iconsax.Outline.Link21: ImageVector
    get() {
        if (_Link21 != null) {
            return _Link21!!
        }
        _Link21 = ImageVector.Builder(
            name = "Outline.Link21",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 18.25f)
                horizontalLineTo(14.99f)
                curveTo(14.58f, 18.25f, 14.24f, 17.91f, 14.24f, 17.5f)
                curveTo(14.24f, 17.09f, 14.58f, 16.75f, 14.99f, 16.75f)
                horizontalLineTo(16.5f)
                curveTo(19.12f, 16.75f, 21.25f, 14.62f, 21.25f, 12f)
                curveTo(21.25f, 9.38f, 19.12f, 7.25f, 16.5f, 7.25f)
                horizontalLineTo(15f)
                curveTo(14.59f, 7.25f, 14.25f, 6.91f, 14.25f, 6.5f)
                curveTo(14.25f, 6.09f, 14.58f, 5.75f, 15f, 5.75f)
                horizontalLineTo(16.5f)
                curveTo(19.95f, 5.75f, 22.75f, 8.55f, 22.75f, 12f)
                curveTo(22.75f, 15.45f, 19.95f, 18.25f, 16.5f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 18.25f)
                horizontalLineTo(7.5f)
                curveTo(4.05f, 18.25f, 1.25f, 15.45f, 1.25f, 12f)
                curveTo(1.25f, 8.55f, 4.05f, 5.75f, 7.5f, 5.75f)
                horizontalLineTo(9f)
                curveTo(9.41f, 5.75f, 9.75f, 6.09f, 9.75f, 6.5f)
                curveTo(9.75f, 6.91f, 9.41f, 7.25f, 9f, 7.25f)
                horizontalLineTo(7.5f)
                curveTo(4.88f, 7.25f, 2.75f, 9.38f, 2.75f, 12f)
                curveTo(2.75f, 14.62f, 4.88f, 16.75f, 7.5f, 16.75f)
                horizontalLineTo(9f)
                curveTo(9.41f, 16.75f, 9.75f, 17.09f, 9.75f, 17.5f)
                curveTo(9.75f, 17.91f, 9.41f, 18.25f, 9f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 12.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8f, 11.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16f, 12.75f)
                close()
            }
        }.build()

        return _Link21!!
    }

@Suppress("ObjectPropertyName")
private var _Link21: ImageVector? = null
