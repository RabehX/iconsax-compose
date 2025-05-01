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

val Iconsax.Outline.ArrowUp: ImageVector
    get() {
        if (_ArrowUp != null) {
            return _ArrowUp!!
        }
        _ArrowUp = ImageVector.Builder(
            name = "Outline.ArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.67f, 18.75f)
                horizontalLineTo(9.33f)
                curveTo(7.45f, 18.75f, 6.02f, 18.07f, 5.31f, 16.84f)
                curveTo(4.6f, 15.61f, 4.73f, 14.03f, 5.67f, 12.4f)
                lineTo(8.34f, 7.77f)
                curveTo(9.28f, 6.15f, 10.58f, 5.25f, 12f, 5.25f)
                curveTo(13.42f, 5.25f, 14.72f, 6.15f, 15.66f, 7.78f)
                lineTo(18.33f, 12.41f)
                curveTo(19.27f, 14.04f, 19.4f, 15.62f, 18.69f, 16.85f)
                curveTo(17.98f, 18.07f, 16.55f, 18.75f, 14.67f, 18.75f)
                close()
                moveTo(12f, 6.75f)
                curveTo(11.14f, 6.75f, 10.3f, 7.38f, 9.64f, 8.53f)
                lineTo(6.97f, 13.16f)
                curveTo(6.31f, 14.31f, 6.18f, 15.35f, 6.61f, 16.1f)
                curveTo(7.04f, 16.85f, 8.01f, 17.26f, 9.33f, 17.26f)
                horizontalLineTo(14.67f)
                curveTo(15.99f, 17.26f, 16.96f, 16.85f, 17.39f, 16.1f)
                curveTo(17.82f, 15.35f, 17.69f, 14.31f, 17.03f, 13.16f)
                lineTo(14.36f, 8.53f)
                curveTo(13.7f, 7.38f, 12.86f, 6.75f, 12f, 6.75f)
                close()
            }
        }.build()

        return _ArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp: ImageVector? = null
