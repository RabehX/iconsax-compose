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

val Iconsax.Outline.Bill: ImageVector
    get() {
        if (_Bill != null) {
            return _Bill!!
        }
        _Bill = ImageVector.Builder(
            name = "Outline.Bill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.25f)
                curveTo(11.18f, 22.25f, 10.36f, 21.99f, 9.68f, 21.48f)
                lineTo(4.47f, 17.58f)
                curveTo(3.5f, 16.85f, 2.92f, 15.69f, 2.92f, 14.48f)
                verticalLineTo(1.76f)
                horizontalLineTo(21.08f)
                verticalLineTo(14.48f)
                curveTo(21.08f, 15.69f, 20.5f, 16.85f, 19.53f, 17.58f)
                lineTo(14.32f, 21.48f)
                curveTo(13.64f, 21.99f, 12.82f, 22.25f, 12f, 22.25f)
                close()
                moveTo(4.42f, 3.25f)
                verticalLineTo(14.47f)
                curveTo(4.42f, 15.21f, 4.78f, 15.92f, 5.37f, 16.37f)
                lineTo(10.58f, 20.27f)
                curveTo(11.42f, 20.9f, 12.59f, 20.9f, 13.43f, 20.27f)
                lineTo(18.64f, 16.37f)
                curveTo(19.23f, 15.92f, 19.59f, 15.21f, 19.59f, 14.47f)
                verticalLineTo(3.25f)
                horizontalLineTo(4.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 3.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 3.25f, 1.25f, 2.91f, 1.25f, 2.5f)
                curveTo(1.25f, 2.09f, 1.59f, 1.75f, 2f, 1.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 1.75f, 22.75f, 2.09f, 22.75f, 2.5f)
                curveTo(22.75f, 2.91f, 22.41f, 3.25f, 22f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 8.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 8.75f, 7.25f, 8.41f, 7.25f, 8f)
                curveTo(7.25f, 7.59f, 7.59f, 7.25f, 8f, 7.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 7.25f, 16.75f, 7.59f, 16.75f, 8f)
                curveTo(16.75f, 8.41f, 16.41f, 8.75f, 16f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 13.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 13.75f, 7.25f, 13.41f, 7.25f, 13f)
                curveTo(7.25f, 12.59f, 7.59f, 12.25f, 8f, 12.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 12.25f, 16.75f, 12.59f, 16.75f, 13f)
                curveTo(16.75f, 13.41f, 16.41f, 13.75f, 16f, 13.75f)
                close()
            }
        }.build()

        return _Bill!!
    }

@Suppress("ObjectPropertyName")
private var _Bill: ImageVector? = null
