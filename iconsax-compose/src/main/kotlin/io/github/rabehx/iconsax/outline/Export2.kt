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

val Iconsax.Outline.Export2: ImageVector
    get() {
        if (_Export2 != null) {
            return _Export2!!
        }
        _Export2 = ImageVector.Builder(
            name = "Outline.Export2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                curveTo(12.75f, 2.41f, 12.41f, 2.75f, 12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 11.59f, 21.59f, 11.25f, 22f, 11.25f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 11.75f)
                curveTo(12.809f, 11.75f, 12.62f, 11.68f, 12.469f, 11.53f)
                curveTo(12.179f, 11.24f, 12.179f, 10.76f, 12.469f, 10.47f)
                lineTo(20.67f, 2.27f)
                curveTo(20.959f, 1.98f, 21.44f, 1.98f, 21.729f, 2.27f)
                curveTo(22.02f, 2.56f, 22.02f, 3.04f, 21.729f, 3.33f)
                lineTo(13.53f, 11.53f)
                curveTo(13.38f, 11.68f, 13.189f, 11.75f, 13f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7.58f)
                curveTo(21.59f, 7.58f, 21.25f, 7.24f, 21.25f, 6.83f)
                verticalLineTo(2.75f)
                horizontalLineTo(17.17f)
                curveTo(16.76f, 2.75f, 16.42f, 2.41f, 16.42f, 2f)
                curveTo(16.42f, 1.59f, 16.76f, 1.25f, 17.17f, 1.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 1.25f, 22.75f, 1.59f, 22.75f, 2f)
                verticalLineTo(6.83f)
                curveTo(22.75f, 7.24f, 22.41f, 7.58f, 22f, 7.58f)
                close()
            }
        }.build()

        return _Export2!!
    }

@Suppress("ObjectPropertyName")
private var _Export2: ImageVector? = null
