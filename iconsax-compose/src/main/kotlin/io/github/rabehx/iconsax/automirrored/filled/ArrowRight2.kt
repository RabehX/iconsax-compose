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

package io.github.rabehx.iconsax.automirrored.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.AutoMirrored.Filled.ArrowRight2: ImageVector
    get() {
        if (_ArrowRight2 != null) {
            return _ArrowRight2!!
        }
        _ArrowRight2 = ImageVector.Builder(
            name = "ArrowRight2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.2f, 10.492f)
                lineToRelative(-1.97f, -1.97f)
                lineToRelative(-3.21f, -3.21f)
                curveToRelative(-0.68f, -0.67f, -1.84f, -0.19f, -1.84f, 0.77f)
                verticalLineToRelative(11.84f)
                curveToRelative(0f, 0.96f, 1.16f, 1.44f, 1.84f, 0.76f)
                lineToRelative(5.18f, -5.18f)
                curveToRelative(0.83f, -0.82f, 0.83f, -2.18f, 0f, -3.01f)
                close()
            }
        }.build()

        return _ArrowRight2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight2: ImageVector? = null
