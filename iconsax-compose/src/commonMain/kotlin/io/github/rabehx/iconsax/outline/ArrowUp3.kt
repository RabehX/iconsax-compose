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

val Iconsax.Outline.ArrowUp3: ImageVector
    get() {
        if (_ArrowUp3 != null) {
            return _ArrowUp3!!
        }
        _ArrowUp3 = ImageVector.Builder(
            name = "Outline.ArrowUp3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.069f, 10.32f)
                curveTo(17.879f, 10.32f, 17.689f, 10.25f, 17.539f, 10.1f)
                lineTo(11.999f, 4.56f)
                lineTo(6.459f, 10.1f)
                curveTo(6.169f, 10.39f, 5.689f, 10.39f, 5.399f, 10.1f)
                curveTo(5.109f, 9.81f, 5.109f, 9.33f, 5.399f, 9.04f)
                lineTo(11.469f, 2.97f)
                curveTo(11.759f, 2.68f, 12.239f, 2.68f, 12.529f, 2.97f)
                lineTo(18.599f, 9.04f)
                curveTo(18.889f, 9.33f, 18.889f, 9.81f, 18.599f, 10.1f)
                curveTo(18.459f, 10.25f, 18.259f, 10.32f, 18.069f, 10.32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.25f)
                curveTo(11.59f, 21.25f, 11.25f, 20.91f, 11.25f, 20.5f)
                verticalLineTo(3.67f)
                curveTo(11.25f, 3.26f, 11.59f, 2.92f, 12f, 2.92f)
                curveTo(12.41f, 2.92f, 12.75f, 3.26f, 12.75f, 3.67f)
                verticalLineTo(20.5f)
                curveTo(12.75f, 20.91f, 12.41f, 21.25f, 12f, 21.25f)
                close()
            }
        }.build()

        return _ArrowUp3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp3: ImageVector? = null
