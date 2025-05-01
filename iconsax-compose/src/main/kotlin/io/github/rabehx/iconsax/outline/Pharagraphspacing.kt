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

val Iconsax.Outline.Pharagraphspacing: ImageVector
    get() {
        if (_Pharagraphspacing != null) {
            return _Pharagraphspacing!!
        }
        _Pharagraphspacing = ImageVector.Builder(
            name = "Outline.Pharagraphspacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22f)
                curveTo(2.25f, 21.59f, 2.59f, 21.25f, 3f, 21.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 21.25f, 21.75f, 21.59f, 21.75f, 22f)
                curveTo(21.75f, 22.41f, 21.41f, 22.75f, 21f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 2.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 2.75f, 2.25f, 2.41f, 2.25f, 2f)
                curveTo(2.25f, 1.59f, 2.59f, 1.25f, 3f, 1.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 1.25f, 21.75f, 1.59f, 21.75f, 2f)
                curveTo(21.75f, 2.41f, 21.41f, 2.75f, 21f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(6f)
                curveTo(11.25f, 5.59f, 11.59f, 5.25f, 12f, 5.25f)
                curveTo(12.41f, 5.25f, 12.75f, 5.59f, 12.75f, 6f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.829f, 8.47f)
                curveTo(14.639f, 8.47f, 14.449f, 8.4f, 14.299f, 8.25f)
                lineTo(11.999f, 5.95f)
                lineTo(9.699f, 8.25f)
                curveTo(9.409f, 8.54f, 8.929f, 8.54f, 8.639f, 8.25f)
                curveTo(8.349f, 7.96f, 8.349f, 7.48f, 8.639f, 7.19f)
                lineTo(11.469f, 4.36f)
                curveTo(11.749f, 4.08f, 12.249f, 4.08f, 12.529f, 4.36f)
                lineTo(15.359f, 7.19f)
                curveTo(15.649f, 7.48f, 15.649f, 7.96f, 15.359f, 8.25f)
                curveTo(15.209f, 8.4f, 15.019f, 8.47f, 14.829f, 8.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 19.47f)
                curveTo(11.799f, 19.47f, 11.609f, 19.39f, 11.469f, 19.25f)
                lineTo(8.639f, 16.42f)
                curveTo(8.349f, 16.13f, 8.349f, 15.65f, 8.639f, 15.36f)
                curveTo(8.929f, 15.07f, 9.409f, 15.07f, 9.699f, 15.36f)
                lineTo(11.999f, 17.66f)
                lineTo(14.299f, 15.36f)
                curveTo(14.589f, 15.07f, 15.069f, 15.07f, 15.359f, 15.36f)
                curveTo(15.649f, 15.65f, 15.649f, 16.13f, 15.359f, 16.42f)
                lineTo(12.529f, 19.25f)
                curveTo(12.389f, 19.39f, 12.199f, 19.47f, 11.999f, 19.47f)
                close()
            }
        }.build()

        return _Pharagraphspacing!!
    }

@Suppress("ObjectPropertyName")
private var _Pharagraphspacing: ImageVector? = null
