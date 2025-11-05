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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = ImageVector.Builder(
            name = "Outline.Profile",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(12.16f, 11.62f)
                    curveTo(12.13f, 11.62f, 12.11f, 11.62f, 12.08f, 11.62f)
                    curveTo(12.03f, 11.61f, 11.96f, 11.61f, 11.9f, 11.62f)
                    curveTo(9.0f, 11.53f, 6.81f, 9.25f, 6.81f, 6.44f)
                    curveTo(6.81f, 3.58f, 9.14f, 1.25f, 12.0f, 1.25f)
                    curveTo(14.86f, 1.25f, 17.19f, 3.58f, 17.19f, 6.44f)
                    curveTo(17.18f, 9.25f, 14.98f, 11.53f, 12.19f, 11.62f)
                    curveTo(12.18f, 11.62f, 12.17f, 11.62f, 12.16f, 11.62f)
                    close()
                    moveTo(12.0f, 2.75f)
                    curveTo(9.97f, 2.75f, 8.31f, 4.41f, 8.31f, 6.44f)
                    curveTo(8.31f, 8.44f, 9.87f, 10.05f, 11.86f, 10.12f)
                    curveTo(11.91f, 10.11f, 12.05f, 10.11f, 12.18f, 10.12f)
                    curveTo(14.14f, 10.03f, 15.68f, 8.42f, 15.69f, 6.44f)
                    curveTo(15.69f, 4.41f, 14.03f, 2.75f, 12.0f, 2.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(12.17f, 22.55f)
                    curveTo(10.21f, 22.55f, 8.24f, 22.05f, 6.75f, 21.05f)
                    curveTo(5.36f, 20.13f, 4.6f, 18.87f, 4.6f, 17.5f)
                    curveTo(4.6f, 16.13f, 5.36f, 14.86f, 6.75f, 13.93f)
                    curveTo(9.75f, 11.94f, 14.61f, 11.94f, 17.59f, 13.93f)
                    curveTo(18.97f, 14.85f, 19.74f, 16.11f, 19.74f, 17.48f)
                    curveTo(19.74f, 18.85f, 18.98f, 20.12f, 17.59f, 21.05f)
                    curveTo(16.09f, 22.05f, 14.13f, 22.55f, 12.17f, 22.55f)
                    close()
                    moveTo(7.58f, 15.19f)
                    curveTo(6.62f, 15.83f, 6.1f, 16.65f, 6.1f, 17.51f)
                    curveTo(6.1f, 18.36f, 6.63f, 19.18f, 7.58f, 19.81f)
                    curveTo(10.07f, 21.48f, 14.27f, 21.48f, 16.76f, 19.81f)
                    curveTo(17.72f, 19.17f, 18.24f, 18.35f, 18.24f, 17.49f)
                    curveTo(18.24f, 16.64f, 17.71f, 15.82f, 16.76f, 15.19f)
                    curveTo(14.27f, 13.53f, 10.07f, 13.53f, 7.58f, 15.19f)
                    close()
                }
            }
        }
            .build()
        return _profile!!
    }

private var _profile: ImageVector? = null
