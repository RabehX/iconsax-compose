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

val Iconsax.Outline.Discover1: ImageVector
    get() {
        if (_Discover1 != null) {
            return _Discover1!!
        }
        _Discover1 = ImageVector.Builder(
            name = "Outline.Discover1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.909f, 22.82f)
                curveTo(3.819f, 22.82f, 2.889f, 22.47f, 2.209f, 21.79f)
                curveTo(1.239f, 20.82f, 0.939f, 19.34f, 1.369f, 17.62f)
                lineTo(3.849f, 7.69f)
                curveTo(4.279f, 5.97f, 5.959f, 4.3f, 7.669f, 3.87f)
                lineTo(17.599f, 1.39f)
                curveTo(19.319f, 0.96f, 20.799f, 1.26f, 21.769f, 2.23f)
                curveTo(22.739f, 3.2f, 23.039f, 4.68f, 22.609f, 6.4f)
                lineTo(20.129f, 16.33f)
                curveTo(19.699f, 18.05f, 18.019f, 19.72f, 16.309f, 20.15f)
                lineTo(6.379f, 22.63f)
                curveTo(5.869f, 22.75f, 5.379f, 22.82f, 4.909f, 22.82f)
                close()
                moveTo(17.979f, 2.83f)
                lineTo(8.049f, 5.32f)
                curveTo(6.879f, 5.61f, 5.609f, 6.88f, 5.309f, 8.05f)
                lineTo(2.829f, 17.98f)
                curveTo(2.529f, 19.17f, 2.689f, 20.14f, 3.269f, 20.73f)
                curveTo(3.849f, 21.31f, 4.829f, 21.47f, 6.019f, 21.17f)
                lineTo(15.949f, 18.69f)
                curveTo(17.119f, 18.4f, 18.389f, 17.12f, 18.679f, 15.96f)
                lineTo(21.159f, 6.03f)
                curveTo(21.459f, 4.84f, 21.299f, 3.87f, 20.719f, 3.28f)
                curveTo(20.139f, 2.69f, 19.169f, 2.54f, 17.979f, 2.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(9.66f, 16.25f, 7.75f, 14.34f, 7.75f, 12f)
                curveTo(7.75f, 9.66f, 9.66f, 7.75f, 12f, 7.75f)
                curveTo(14.34f, 7.75f, 16.25f, 9.66f, 16.25f, 12f)
                curveTo(16.25f, 14.34f, 14.34f, 16.25f, 12f, 16.25f)
                close()
                moveTo(12f, 9.25f)
                curveTo(10.48f, 9.25f, 9.25f, 10.48f, 9.25f, 12f)
                curveTo(9.25f, 13.52f, 10.48f, 14.75f, 12f, 14.75f)
                curveTo(13.52f, 14.75f, 14.75f, 13.52f, 14.75f, 12f)
                curveTo(14.75f, 10.48f, 13.52f, 9.25f, 12f, 9.25f)
                close()
            }
        }.build()

        return _Discover1!!
    }

@Suppress("ObjectPropertyName")
private var _Discover1: ImageVector? = null
