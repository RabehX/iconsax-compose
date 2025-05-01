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

val Iconsax.Outline.Timer: ImageVector
    get() {
        if (_Timer != null) {
            return _Timer!!
        }
        _Timer = ImageVector.Builder(
            name = "Outline.Timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.24f, 22.75f)
                horizontalLineTo(8.76f)
                curveTo(6.87f, 22.75f, 5.49f, 21.96f, 4.96f, 20.6f)
                curveTo(4.41f, 19.18f, 4.92f, 17.42f, 6.24f, 16.23f)
                lineTo(10.88f, 12f)
                lineTo(6.24f, 7.77f)
                curveTo(4.92f, 6.58f, 4.41f, 4.82f, 4.96f, 3.4f)
                curveTo(5.49f, 2.03f, 6.87f, 1.25f, 8.76f, 1.25f)
                horizontalLineTo(15.24f)
                curveTo(17.13f, 1.25f, 18.51f, 2.04f, 19.04f, 3.4f)
                curveTo(19.59f, 4.82f, 19.08f, 6.58f, 17.76f, 7.77f)
                lineTo(13.12f, 12f)
                lineTo(17.77f, 16.23f)
                curveTo(19.08f, 17.42f, 19.6f, 19.18f, 19.05f, 20.6f)
                curveTo(18.51f, 21.96f, 17.13f, 22.75f, 15.24f, 22.75f)
                close()
                moveTo(12f, 13.01f)
                lineTo(7.25f, 17.33f)
                curveTo(6.41f, 18.1f, 6.04f, 19.22f, 6.36f, 20.05f)
                curveTo(6.66f, 20.82f, 7.51f, 21.25f, 8.76f, 21.25f)
                horizontalLineTo(15.24f)
                curveTo(16.49f, 21.25f, 17.34f, 20.83f, 17.64f, 20.05f)
                curveTo(17.96f, 19.22f, 17.6f, 18.1f, 16.75f, 17.33f)
                lineTo(12f, 13.01f)
                close()
                moveTo(8.76f, 2.75f)
                curveTo(7.51f, 2.75f, 6.66f, 3.17f, 6.36f, 3.95f)
                curveTo(6.04f, 4.78f, 6.4f, 5.9f, 7.25f, 6.67f)
                lineTo(12f, 10.99f)
                lineTo(16.75f, 6.67f)
                curveTo(17.59f, 5.9f, 17.96f, 4.78f, 17.64f, 3.95f)
                curveTo(17.34f, 3.18f, 16.49f, 2.75f, 15.24f, 2.75f)
                horizontalLineTo(8.76f)
                close()
            }
        }.build()

        return _Timer!!
    }

@Suppress("ObjectPropertyName")
private var _Timer: ImageVector? = null
