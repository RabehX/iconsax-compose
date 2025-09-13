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

val Iconsax.Outline.Export: ImageVector
    get() {
        if (_Export != null) {
            return _Export!!
        }
        _Export = ImageVector.Builder(
            name = "Outline.Export",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.44f, 7.25f)
                curveTo(14.25f, 7.25f, 14.06f, 7.18f, 13.91f, 7.03f)
                lineTo(11.88f, 5f)
                lineTo(9.85f, 7.03f)
                curveTo(9.56f, 7.32f, 9.08f, 7.32f, 8.79f, 7.03f)
                curveTo(8.5f, 6.74f, 8.5f, 6.26f, 8.79f, 5.97f)
                lineTo(11.35f, 3.41f)
                curveTo(11.64f, 3.12f, 12.12f, 3.12f, 12.41f, 3.41f)
                lineTo(14.97f, 5.97f)
                curveTo(15.26f, 6.26f, 15.26f, 6.74f, 14.97f, 7.03f)
                curveTo(14.82f, 7.18f, 14.63f, 7.25f, 14.44f, 7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.881f, 14.93f)
                curveTo(11.471f, 14.93f, 11.131f, 14.59f, 11.131f, 14.18f)
                verticalLineTo(4.01f)
                curveTo(11.131f, 3.6f, 11.471f, 3.26f, 11.881f, 3.26f)
                curveTo(12.291f, 3.26f, 12.631f, 3.6f, 12.631f, 4.01f)
                verticalLineTo(14.18f)
                curveTo(12.631f, 14.6f, 12.291f, 14.93f, 11.881f, 14.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 20.75f)
                curveTo(6.85f, 20.75f, 3.25f, 17.15f, 3.25f, 12f)
                curveTo(3.25f, 11.59f, 3.59f, 11.25f, 4f, 11.25f)
                curveTo(4.41f, 11.25f, 4.75f, 11.59f, 4.75f, 12f)
                curveTo(4.75f, 16.27f, 7.73f, 19.25f, 12f, 19.25f)
                curveTo(16.27f, 19.25f, 19.25f, 16.27f, 19.25f, 12f)
                curveTo(19.25f, 11.59f, 19.59f, 11.25f, 20f, 11.25f)
                curveTo(20.41f, 11.25f, 20.75f, 11.59f, 20.75f, 12f)
                curveTo(20.75f, 17.15f, 17.15f, 20.75f, 12f, 20.75f)
                close()
            }
        }.build()

        return _Export!!
    }

@Suppress("ObjectPropertyName")
private var _Export: ImageVector? = null
