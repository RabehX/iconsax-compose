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

val Iconsax.AutoMirrored.Filled.ArrowLeft3: ImageVector
    get() {
        if (_ArrowLeft3 != null) {
            return _ArrowLeft3!!
        }
        _ArrowLeft3 = ImageVector.Builder(
            name = "ArrowLeft3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 9.33f)
                verticalLineToRelative(5.34f)
                curveToRelative(0f, 3.32f, -2.35f, 4.67f, -5.22f, 3.02f)
                lineToRelative(-1.28f, -0.74f)
                curveToRelative(-0.31f, -0.18f, -0.5f, -0.51f, -0.5f, -0.87f)
                verticalLineTo(7.92f)
                curveToRelative(0f, -0.36f, 0.19f, -0.69f, 0.5f, -0.87f)
                lineToRelative(1.28f, -0.74f)
                curveTo(15.65f, 4.66f, 18f, 6.01f, 18f, 9.33f)
                close()
                moveTo(9.999f, 8.792f)
                verticalLineToRelative(6.43f)
                curveToRelative(0f, 0.39f, -0.42f, 0.63f, -0.75f, 0.43f)
                lineToRelative(-1.1f, -0.64f)
                curveToRelative(-2.87f, -1.65f, -2.87f, -4.37f, 0f, -6.02f)
                lineToRelative(1.1f, -0.64f)
                curveToRelative(0.33f, -0.19f, 0.75f, 0.05f, 0.75f, 0.44f)
                close()
            }
        }.build()

        return _ArrowLeft3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft3: ImageVector? = null
