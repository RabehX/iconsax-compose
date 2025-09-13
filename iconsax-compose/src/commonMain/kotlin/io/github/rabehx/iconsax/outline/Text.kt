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

val Iconsax.Outline.Text: ImageVector
    get() {
        if (_Text != null) {
            return _Text!!
        }
        _Text = ImageVector.Builder(
            name = "Outline.Text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.33f, 7.92f)
                curveTo(20.92f, 7.92f, 20.58f, 7.58f, 20.58f, 7.17f)
                verticalLineTo(5.35f)
                curveTo(20.58f, 4.62f, 19.99f, 4.03f, 19.26f, 4.03f)
                horizontalLineTo(4.74f)
                curveTo(4.01f, 4.03f, 3.42f, 4.62f, 3.42f, 5.35f)
                verticalLineTo(7.18f)
                curveTo(3.42f, 7.59f, 3.08f, 7.93f, 2.67f, 7.93f)
                curveTo(2.26f, 7.93f, 1.92f, 7.59f, 1.92f, 7.17f)
                verticalLineTo(5.35f)
                curveTo(1.92f, 3.79f, 3.19f, 2.53f, 4.74f, 2.53f)
                horizontalLineTo(19.26f)
                curveTo(20.82f, 2.53f, 22.08f, 3.8f, 22.08f, 5.35f)
                verticalLineTo(7.18f)
                curveTo(22.08f, 7.59f, 21.75f, 7.92f, 21.33f, 7.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.47f)
                curveTo(11.59f, 21.47f, 11.25f, 21.13f, 11.25f, 20.72f)
                verticalLineTo(4.11f)
                curveTo(11.25f, 3.7f, 11.59f, 3.36f, 12f, 3.36f)
                curveTo(12.41f, 3.36f, 12.75f, 3.7f, 12.75f, 4.11f)
                verticalLineTo(20.72f)
                curveTo(12.75f, 21.14f, 12.41f, 21.47f, 12f, 21.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.941f, 21.47f)
                horizontalLineTo(8.061f)
                curveTo(7.651f, 21.47f, 7.311f, 21.13f, 7.311f, 20.72f)
                curveTo(7.311f, 20.31f, 7.651f, 19.97f, 8.061f, 19.97f)
                horizontalLineTo(15.941f)
                curveTo(16.351f, 19.97f, 16.691f, 20.31f, 16.691f, 20.72f)
                curveTo(16.691f, 21.13f, 16.351f, 21.47f, 15.941f, 21.47f)
                close()
            }
        }.build()

        return _Text!!
    }

@Suppress("ObjectPropertyName")
private var _Text: ImageVector? = null
