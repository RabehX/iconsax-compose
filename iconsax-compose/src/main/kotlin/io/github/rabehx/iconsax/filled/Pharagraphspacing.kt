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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Pharagraphspacing: ImageVector
    get() {
        if (_Pharagraphspacing != null) {
            return _Pharagraphspacing!!
        }
        _Pharagraphspacing = ImageVector.Builder(
            name = "Filled.Pharagraphspacing",
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
                moveTo(14.299f, 15.358f)
                lineTo(12.749f, 16.908f)
                verticalLineTo(6.698f)
                lineTo(14.299f, 8.248f)
                curveTo(14.449f, 8.398f, 14.639f, 8.468f, 14.829f, 8.468f)
                curveTo(15.019f, 8.468f, 15.209f, 8.398f, 15.359f, 8.248f)
                curveTo(15.649f, 7.958f, 15.649f, 7.478f, 15.359f, 7.188f)
                lineTo(12.529f, 4.358f)
                curveTo(12.249f, 4.078f, 11.749f, 4.078f, 11.469f, 4.358f)
                lineTo(8.639f, 7.188f)
                curveTo(8.349f, 7.478f, 8.349f, 7.958f, 8.639f, 8.248f)
                curveTo(8.929f, 8.538f, 9.409f, 8.538f, 9.699f, 8.248f)
                lineTo(11.249f, 6.698f)
                verticalLineTo(16.908f)
                lineTo(9.699f, 15.358f)
                curveTo(9.409f, 15.068f, 8.929f, 15.068f, 8.639f, 15.358f)
                curveTo(8.349f, 15.648f, 8.349f, 16.128f, 8.639f, 16.418f)
                lineTo(11.469f, 19.248f)
                curveTo(11.609f, 19.388f, 11.799f, 19.468f, 11.999f, 19.468f)
                curveTo(12.199f, 19.468f, 12.389f, 19.388f, 12.529f, 19.248f)
                lineTo(15.359f, 16.418f)
                curveTo(15.649f, 16.128f, 15.649f, 15.648f, 15.359f, 15.358f)
                curveTo(15.069f, 15.068f, 14.589f, 15.068f, 14.299f, 15.358f)
                close()
            }
        }.build()

        return _Pharagraphspacing!!
    }

@Suppress("ObjectPropertyName")
private var _Pharagraphspacing: ImageVector? = null
