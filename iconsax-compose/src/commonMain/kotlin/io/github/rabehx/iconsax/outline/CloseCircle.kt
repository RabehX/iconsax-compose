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

val Iconsax.Outline.CloseCircle: ImageVector
    get() {
        if (_CloseCircle != null) {
            return _CloseCircle!!
        }
        _CloseCircle = ImageVector.Builder(
            name = "Outline.CloseCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.169f, 15.58f)
                curveTo(8.979f, 15.58f, 8.789f, 15.51f, 8.639f, 15.36f)
                curveTo(8.349f, 15.07f, 8.349f, 14.59f, 8.639f, 14.3f)
                lineTo(14.299f, 8.64f)
                curveTo(14.589f, 8.35f, 15.069f, 8.35f, 15.359f, 8.64f)
                curveTo(15.649f, 8.93f, 15.649f, 9.41f, 15.359f, 9.7f)
                lineTo(9.699f, 15.36f)
                curveTo(9.559f, 15.51f, 9.359f, 15.58f, 9.169f, 15.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.829f, 15.58f)
                curveTo(14.639f, 15.58f, 14.449f, 15.51f, 14.299f, 15.36f)
                lineTo(8.639f, 9.7f)
                curveTo(8.349f, 9.41f, 8.349f, 8.93f, 8.639f, 8.64f)
                curveTo(8.929f, 8.35f, 9.409f, 8.35f, 9.699f, 8.64f)
                lineTo(15.359f, 14.3f)
                curveTo(15.649f, 14.59f, 15.649f, 15.07f, 15.359f, 15.36f)
                curveTo(15.209f, 15.51f, 15.019f, 15.58f, 14.829f, 15.58f)
                close()
            }
        }.build()

        return _CloseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CloseCircle: ImageVector? = null
